package com.github.raphaelfontoura.inheritance.controller

import com.github.raphaelfontoura.inheritance.model.Animal
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
    private val zooRepository: ZooRepository
) {

    @GetMapping
    fun getZoos(): Any {
        return zooRepository.findAll()
    }

    @PostMapping
    fun saveZoo(@RequestBody zoo: Zoo) {
        zooRepository.save(zoo)
    }
}