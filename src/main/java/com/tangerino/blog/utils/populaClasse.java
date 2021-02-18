package com.tangerino.blog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tangerino.blog.model.Post;
import com.tangerino.blog.repository.blogrepository;

@Component
public class populaClasse {
	
	@Autowired
	blogrepository blogrepositoryobj;

	@PostConstruct
	public void savePost() {
		
		List<Post> postlist = new ArrayList<>();	
		Post post= new Post();
		post.setAutor("Raphael");
		post.setDate(LocalDate.now());
		post.setTexto("A gestão por competências permite que o RH crie estratégias para o desenvolvimento dos funcionários. Algo que melhora os resultados da empresa e aumenta sua competitividade.\r\n" + 
				"\r\n" + 
				"Se você quer que seu RH desempenhe um papel mais decisivo no sucesso da organização, deve querer saber como se dá essa gestão, certo? Preparamos este post justamente para explicar tudo o que você precisa saber a respeito.\r\n" + 
				"\r\n" + 
				"Siga em frente e boa leitura! Abordaremos os seguintes tópicos:");
		post.setTitulo("Gestão Por Competências: Saiba Como Implementar Em Sua Empresa e Quais as Vantagens");
		postlist.add(post);
		
		/*for (Post post1 : postlist) {
			Post postsave = blogrepositoryobj.save(post1);
		}*/
		
	}
	
	
}
