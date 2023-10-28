package com.example.swagger.service;

import com.example.swagger.domain.entity.CustomUser;
import com.example.swagger.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public Iterable<CustomUser> findAll(){
        return this.repo.findAll();
    }

    public CustomUser save(CustomUser user){
        return this.repo.save(user);
    }

}
