package com.oh29oh29.jpa.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import java.util.*

@Entity
data class PaymentReceipt(
    @OneToOne(fetch = FetchType.LAZY)
    val payment: Payment
) {
    @Id
    val id: String = UUID.randomUUID().toString()
}