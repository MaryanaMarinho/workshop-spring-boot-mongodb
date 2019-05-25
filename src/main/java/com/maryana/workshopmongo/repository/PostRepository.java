package com.maryana.workshopmongo.repository;

import com.maryana.workshopmongo.domain.Post;
import com.maryana.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
