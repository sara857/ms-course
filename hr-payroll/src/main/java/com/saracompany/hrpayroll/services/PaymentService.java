package com.saracompany.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.saracompany.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workId, int days) {
		return new Payment("Sara", 200.0, days);
	}

}
