package com.example.blog_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog_app.model.Category;
import com.example.blog_app.model.Post;
import com.example.blog_app.model.User;

public interface PostRepository extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);

}
