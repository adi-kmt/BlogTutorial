package com.adithya.BlogTutorial.repositories;

import com.adithya.BlogTutorial.entities.Category;
import com.adithya.BlogTutorial.entities.Post;
import com.adithya.BlogTutorial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findByUser(User user);

    List<Post> findByCategory(Category category);
}
