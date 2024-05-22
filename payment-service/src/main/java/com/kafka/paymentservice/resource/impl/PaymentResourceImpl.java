package com.kafka.paymentservice.resource.impl;

import com.kafka.paymentservice.model.Payment;
import com.kafka.paymentservice.resource.PaymentResource;
import com.kafka.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    private  final PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPyament(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
