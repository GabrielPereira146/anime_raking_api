package com.project.api.anime_raking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.anime_raking.users.Users;
import com.project.api.anime_raking.users.UsersRepository;
import com.project.api.anime_raking.users.UsersRequestDTO;

import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/auth/register")
    public ResponseEntity registerUser(@RequestBody UsersRequestDTO data){
        Users userData = new Users(data);

        var user = this.usersRepository.findByUsername(userData.getUsername());

        if (user != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario já existe");
        }

        var passwordHashred = BCrypt.withDefaults().hashToString(12, userData.getUser_password().toCharArray());
        userData.setUser_password(passwordHashred);

        var userCreated = this.usersRepository.save(userData);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
