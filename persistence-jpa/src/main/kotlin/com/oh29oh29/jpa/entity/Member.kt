package com.oh29oh29.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class Member(
    val name:  String
) {
    @Id
    val id: String = UUID.randomUUID().toString()
}