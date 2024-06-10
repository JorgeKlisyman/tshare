package com.techdevbrazil.tshare.repository;

import com.techdevbrazil.tshare.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
