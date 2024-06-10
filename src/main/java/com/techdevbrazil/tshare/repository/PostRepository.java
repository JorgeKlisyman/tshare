package com.techdevbrazil.tshare.repository;

import com.techdevbrazil.tshare.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

