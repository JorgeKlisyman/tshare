package com.techdevbrazil.tshare.repository;

import com.techdevbrazil.tshare.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}


