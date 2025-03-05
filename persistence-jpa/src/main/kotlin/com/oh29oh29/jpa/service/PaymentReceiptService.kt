package com.oh29oh29.jpa.service

import com.oh29oh29.jpa.repository.MemberRepository
import com.oh29oh29.jpa.repository.PaymentReceiptRepository
import com.oh29oh29.jpa.repository.PaymentRepository
import org.springframework.stereotype.Service

@Service
class PaymentReceiptService(
    private val paymentReceiptRepository: PaymentReceiptRepository,
    private val paymentRepository: PaymentRepository,
    private val memberRepository: MemberRepository,
)