package com.techdevbrazil.tshare.repository;

import com.techdevbrazil.tshare.entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Likes, Long> {
}

