package com.example.blog_app.service;

import java.util.List;

import com.example.blog_app.payloads.PostDto;

public interface PostService {
	
	//create
//	 PostDto createPost(PostDto PostDto); 
	//update
	 PostDto updatePost(PostDto postDto, Integer PostId);
	//delete
	 void deletePost(Integer PostId);
	//get
	 PostDto getPost(Integer PostId);
	//getAll
	 List<PostDto> getAllPost();
	 
	 List<PostDto> getAllPostByCategory(Integer categoryId);
	 List<PostDto> getAllPostByUser(Integer userId);
	 List<PostDto> searchPost(String keywords);
	PostDto createPost(PostDto PostDto, Integer userId, Integer CategoryId);

}
