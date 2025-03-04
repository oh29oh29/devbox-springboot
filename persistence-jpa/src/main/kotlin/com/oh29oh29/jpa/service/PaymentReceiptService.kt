package com.oh29oh29.jpa.service

import com.oh29oh29.jpa.entity.Member
import com.oh29oh29.jpa.entity.Payment
import com.oh29oh29.jpa.entity.PaymentReceipt
import com.oh29oh29.jpa.repository.MemberRepository
import com.oh29oh29.jpa.repository.PaymentReceiptRepository
import com.oh29oh29.jpa.repository.PaymentRepository
import org.hibernate.proxy.HibernateProxy
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PaymentReceiptService(
    private val paymentReceiptRepository: PaymentReceiptRepository,
    private val paymentRepository: PaymentRepository,
    private val memberRepository: MemberRepository,
) {
    lateinit var paymentReceiptId: String

    init {
        init()
    }

    private fun init() {
        val member = Member("user name", "address", "01012341234", "dev@dev.com")
        memberRepository.save(member)

        val payment = Payment(member)
        paymentRepository.save(payment)

        val paymentReceipt = PaymentReceipt(payment)
        paymentReceiptId = paymentReceiptRepository.save(paymentReceipt).id
    }

    @Transactional
    fun getPaymentReceipt() {
        val paymentReceipt = paymentReceiptRepository.getReferenceById(paymentReceiptId)
        println(paymentReceipt.payment is HibernateProxy)
    }
}