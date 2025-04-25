package com.xworksz.anything.runner;
import com.xworksz.anything.things.Payment;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class PaymentRunner {
    public static void main(String[] args){
        System.out.println("payment detail");
        Payment.displaypaymentInformation();
        Payment.displayPaymentAmount(2000);
        Payment.displayTransactionDetails(3000, LocalDateTime.now());
    }
}

