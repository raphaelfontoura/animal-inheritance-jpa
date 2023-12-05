package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.DiscriminatorValue
import java.util.UUID

@DiscriminatorValue(value = "cat")
class Cat(
    override val cor: String?,
) : Animal()