package com.maryana.workshopmongo.repository;

import com.maryana.workshopmongo.domain.Post;
import com.maryana.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    //busca usando o metodo do spring
    List<Post> findByTitleContainingIgnoreCase(String text);

    //busca usando consulta em mongo
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> searchTitle(String text);
}
