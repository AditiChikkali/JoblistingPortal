package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
