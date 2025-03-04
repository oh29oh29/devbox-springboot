package com.oh29oh29.jpa

import com.oh29oh29.jpa.service.PaymentReceiptService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class JpaApplicationRunner(
    private val paymentReceiptService: PaymentReceiptService
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        paymentReceiptService.getPaymentReceipt()
    }
}