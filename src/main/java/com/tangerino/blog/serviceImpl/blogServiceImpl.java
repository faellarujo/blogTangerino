package com.tangerino.blog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tangerino.blog.model.Post;
import com.tangerino.blog.repository.blogrepository;
import com.tangerino.blog.service.blogService;

@Service
public class blogServiceImpl implements blogService{

	@Autowired
	blogrepository blogrepositoryObj;	

	@Override
	public List<Post> findAll() {
		return blogrepositoryObj.findAll();
	}

	@Override
	public Post findById(long id) {
		return blogrepositoryObj.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return blogrepositoryObj.save(post);
	}

}
