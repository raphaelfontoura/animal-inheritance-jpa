package com.github.raphaelfontoura.inheritance.model

import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.DiscriminatorType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import java.util.UUID

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animalType", discriminatorType = DiscriminatorType.STRING)
open class Animal protected constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    open val id: UUID = UUID.randomUUID(),
    open val name: String? = null,
    open val raca: String? = null,
    open val cor: String? = null
)
