package com.github.raphaelfontoura.inheritance.repository

import com.github.raphaelfontoura.inheritance.model.Animal
import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository

interface AnimalRepository : JpaRepository<Animal, UUID>