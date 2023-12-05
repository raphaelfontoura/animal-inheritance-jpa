package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
open class Animal protected constructor() {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open val id: UUID = UUID.randomUUID()

    open val name: String? = null

    @Enumerated(EnumType.STRING)
    open val type = AnimalType.ANIMAL
}
