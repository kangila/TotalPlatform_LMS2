package com.example.demo.admin;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Instructor;

public interface AdminInstructorRepository extends JpaRepository<Instructor, Integer> {

}
