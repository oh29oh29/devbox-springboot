package com.oh29oh29.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class Member(
    val name:  String,
    val address: String,
    val phoneNumber: String,
    val email: String,
) {
    @Id
    val id: String = UUID.randomUUID().toString()
}