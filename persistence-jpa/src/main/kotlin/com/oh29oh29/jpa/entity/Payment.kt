package com.oh29oh29.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import java.util.*

@Entity
data class Payment(
    @ManyToOne(fetch = FetchType.LAZY)
    val member: Member
) {
    @Id
    val id: String = UUID.randomUUID().toString()
}