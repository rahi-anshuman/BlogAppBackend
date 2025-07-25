package com.example.blog_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog_app.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
