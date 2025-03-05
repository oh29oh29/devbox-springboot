package com.oh29oh29.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Index
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(indexes = [Index(name = "IDX_MEMBER_name_address", columnList = "name, address")])
data class Member(
    val name: String,
    val address: String,
    val phoneNumber: String,
    val email: String,
) {
    @Id
    val id: String = UUID.randomUUID().toString()
}