package com.kranthi.riskIqInterview.Payment;

public class ApplePay implements Payment{

    String appleId;

    @Override
    public boolean pay(double amount) {
        return false;
    }
}
