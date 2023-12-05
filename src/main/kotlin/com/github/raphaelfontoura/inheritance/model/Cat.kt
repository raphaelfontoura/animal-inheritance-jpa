package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.Entity

@Entity
class Cat(
    val cor: String?,
) : Animal() {
    override val type = AnimalType.CAT
}