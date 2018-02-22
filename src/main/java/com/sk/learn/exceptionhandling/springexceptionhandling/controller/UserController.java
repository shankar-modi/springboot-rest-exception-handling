package com.sk.learn.exceptionhandling.springexceptionhandling.controller;

import com.sk.learn.exceptionhandling.springexceptionhandling.exceptionhandler.UserNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author shankarmodi
 * 22/02/18
 */

@RestController
public class UserController {

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getUsers() {
        throw new UserNotFoundException("User Not Found");
    }

    @GetMapping("/userss")
    public List<String> getAllUsers() {
        return Arrays.asList("User1");
    }
}






