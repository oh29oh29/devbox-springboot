package com.oh29oh29.jpa.repository

import com.oh29oh29.jpa.entity.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository: JpaRepository<Payment, String>