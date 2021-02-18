package com.tangerino.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tangerino.blog.model.Post;

public interface blogrepository extends JpaRepository<Post, Long> {
	
}
