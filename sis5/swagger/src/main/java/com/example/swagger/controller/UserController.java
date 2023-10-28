package com.example.swagger.controller;

import com.example.swagger.domain.entity.CustomUser;
import com.example.swagger.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;


@RestController
@AllArgsConstructor
@RequestMapping("/api")
@Tag(name = "User", description = "this is test!")
public class UserController {

    final private UserService service;

    @Operation(summary = "findAll employees")
    @GetMapping("/users")
    public Iterable<CustomUser> findAllUser(){
        return this.service.findAll();
    }

    @PostMapping("/users")
    public CustomUser addOneUser(@RequestBody CustomUser user){
        return this.service.save(user);
    }

}
