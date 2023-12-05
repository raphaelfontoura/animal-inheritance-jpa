package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.Entity

@Entity
class Dog(
    val raca: String?,
) : Animal() {

    override val type = AnimalType.DOG
}
