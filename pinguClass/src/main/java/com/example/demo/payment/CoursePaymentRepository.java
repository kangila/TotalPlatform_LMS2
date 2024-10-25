package com.example.demo.payment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CoursePayment;

public interface CoursePaymentRepository extends JpaRepository<CoursePayment, Integer> {

	
}
