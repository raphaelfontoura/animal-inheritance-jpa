package com.github.raphaelfontoura.inheritance.controller

import com.github.raphaelfontoura.inheritance.model.Animal
import com.github.raphaelfontoura.inheritance.model.AnimalType
import com.github.raphaelfontoura.inheritance.model.Cat
import com.github.raphaelfontoura.inheritance.model.Dog
import com.github.raphaelfontoura.inheritance.model.Zoo
import com.github.raphaelfontoura.inheritance.repository.ZooRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("zoo")
class ZooController(
    private val zooRepository: ZooRepository,
) {

    @GetMapping
    fun getZoos(): Any {
        val zoo = zooRepository.findAll()
        val result = zoo[0].animals.map { mapAnimal(it) }
        return result
    }

    private fun mapAnimal(animal: Animal): Map<String, Animal> {
        return when (animal.type) {
            AnimalType.CAT -> mapOf("Cat" to animal)
            AnimalType.DOG -> mapOf("Dog" to animal)
            else -> mapOf("Animal" to animal)
        }
    }

    @PostMapping
    fun saveZoo(@RequestBody zoo: Zoo) {
        zooRepository.save(zoo)
    }
}
