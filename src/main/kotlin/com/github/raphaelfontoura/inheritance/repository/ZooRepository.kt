package com.github.raphaelfontoura.inheritance.repository

import com.github.raphaelfontoura.inheritance.model.Zoo
import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository

interface ZooRepository : JpaRepository<Zoo, UUID>