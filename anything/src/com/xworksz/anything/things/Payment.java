package com.xworksz.anything.things;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Payment {
    public static String paymentFrom;
    public static String paymentTo;
    public static double amount;
    public static LocalDate transactionDate;
    public static LocalTime transactionTime;



    public static void displaypaymentInformation() {
        paymentFrom = "XYZ";
        paymentTo = "ABC";
        amount = 1000;
        transactionDate = LocalDate.now();
        transactionTime = LocalTime.now();


        System.out.println("payment from" + paymentFrom);
        System.out.println("payment to" + paymentTo);
        System.out.println("payment amount" + amount);
        System.out.println("payment from" + transactionDate);
        System.out.println("payment from" + transactionTime);
    }
        // 2 ways
        public static void displayPaymentAmount(double paidamount){
            System.out.println("paid amount is "+paidamount);


    }

    public static void displayTransactionDetails(double paidAmount, LocalDateTime paymentDoneOn){
        System.out.println("paid amount is:"+amount);
        System.out.println("Payment Done on"+paymentDoneOn);
    }

}


