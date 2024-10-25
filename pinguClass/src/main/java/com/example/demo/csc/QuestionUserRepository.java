package com.example.demo.csc;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface QuestionUserRepository extends JpaRepository<User, Integer>{

	Optional<User> findById(String id);
}
