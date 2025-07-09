package com.example.blog_app.payloads;

import com.example.blog_app.model.Category;
import com.example.blog_app.model.User;

public class PostDto {
	
	private String postTitle;
	private String postContent;
	private String postImage;
	private CategoryDto category;
	private UserDto user;
	public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getPostImage() {
		return postImage;
	}
	public void setPostImage(String postImage) {
		this.postImage = postImage;
	}
	public CategoryDto getCategory() {
		return category;
	}
	public void setCategory(CategoryDto category) {
		this.category = category;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	

}
