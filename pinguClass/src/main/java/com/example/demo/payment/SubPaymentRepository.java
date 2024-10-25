package com.example.demo.payment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SubPayment;

public interface SubPaymentRepository extends JpaRepository<SubPayment, Integer> {

}
