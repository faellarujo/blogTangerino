package com.tangerino.blog.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tangerino.blog.model.Post;
import com.tangerino.blog.service.blogService;

@Controller
public class blogController {

	@Autowired
	blogService blogServiceobje;

	@GetMapping(path = "/posts")
	public ModelAndView getPost() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = blogServiceobje.findAll();
		mv.addObject("posts", posts);
		return mv;
	}
	
	
	  @GetMapping(path = "/posts/{id}") public ModelAndView
	  getPostLocalizarUm(@PathVariable("id") long id) { 
	  ModelAndView mv = new ModelAndView("postDetalhado"); 
	  Post post = blogServiceobje.findById(id);
	  mv.addObject("post", post);		  
	  return mv;	  
	  }
	 
	  @GetMapping(path = "/novoPost")
	  public String GetPostForm() {
		 return "postForm"; 
	  }
	  
	  @PostMapping(path = "/novoPost" )
	  public String salvarPost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "redirect:/novoPost"; 
			
		}
		post.setDate(LocalDate.now());
		blogServiceobje.save(post);
		return "redirect:/posts";
		    
		  
	  }
}