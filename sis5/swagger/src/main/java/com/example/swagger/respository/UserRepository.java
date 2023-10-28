package com.example.swagger.respository;

import com.example.swagger.domain.entity.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CustomUser, Long> { }
