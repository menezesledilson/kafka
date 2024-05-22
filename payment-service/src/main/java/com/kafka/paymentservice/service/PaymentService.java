package com.kafka.paymentservice.service;

import com.kafka.paymentservice.model.Payment;

public interface PaymentService {

    void sendPyament(Payment payment);

}
