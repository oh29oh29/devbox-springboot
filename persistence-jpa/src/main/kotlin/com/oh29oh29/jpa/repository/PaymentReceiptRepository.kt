package com.oh29oh29.jpa.repository

import com.oh29oh29.jpa.entity.PaymentReceipt
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentReceiptRepository: JpaRepository<PaymentReceipt, String>