package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue(value = "cat")
class Cat(
    override val cor: String?,
) : Animal()