package com.supdeco.blogousseini.repository;


import com.supdeco.blogousseini.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
