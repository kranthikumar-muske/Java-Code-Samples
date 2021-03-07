package com.kranthi.riskIqInterview.Payment;

import java.util.Date;

public class PayPal implements Payment{
    String name;
    String cardNumber;
    Date Expiry;

    @Override
    public boolean pay(double amount) {
        return false;
    }
}
