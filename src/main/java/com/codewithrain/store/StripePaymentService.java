package com.codewithrain.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("processPayment Amount: " + amount);
    }
}
