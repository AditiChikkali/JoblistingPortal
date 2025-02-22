package controller;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Post;
import repository.PostRepository;
import repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
	
	@Autowired
	PostRepository repo;
	
	@Autowired
	SearchRepository srepo;
	
	@RequestMapping(value= "/")
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect(null);
	}
	
	@GetMapping("/allPosts")
	@CrossOrigin
	public List<Post> getAlllPosts(){
		return repo.findAll();
		
	}
	
	@PostMapping("/post")
	@CrossOrigin
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
		
		
	}
	
	@GetMapping("/posts/{text}")
	@CrossOrigin
	public List<Post> search(@PathVariable String text){
		return srepo.findByText(text);
	}

}
