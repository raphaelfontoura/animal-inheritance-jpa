package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.DiscriminatorValue
import java.util.UUID

@DiscriminatorValue(value = "dog")
class Dog(
    val raca: String?,
) : Animal()
