package com.example.demo.admin;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface AdminUserRepository extends JpaRepository<User, Integer> {

}
