package com.example.demo.payment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PaymentController {

	private final SubPaymentService sps;
	private final CoursePaymentService cps;
	
	@GetMapping("/payment")
	public String payment() {
		
		return "payment/subPaymentOrder"; 
	}
}
