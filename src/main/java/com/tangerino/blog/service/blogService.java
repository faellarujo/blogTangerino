package com.tangerino.blog.service;

import java.util.List;

import com.tangerino.blog.model.Post;

public interface blogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);
	
	
}
