package com.example.blog_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blog_app.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
