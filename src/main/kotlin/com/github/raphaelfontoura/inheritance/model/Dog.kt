package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue(value = "dog")
class Dog(
    override val raca: String?,
) : Animal()
