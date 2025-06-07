package com.todoapp.controller;

import com.todoapp.model.User;
import com.todoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsersController(){
        return userService.getAllUsersService();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserByIdController(@PathVariable Long id){
        return userService.getUserByIdService(id);
    }

    @PostMapping
    public User creatUserController(@RequestBody User user){
        return userService.saveUserService(user);
    }

    @PutMapping("/{id}")
    public User updateUserController(@PathVariable Long id, @RequestBody User user){
        return userService.saveUserService(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserController(@PathVariable Long id){
        userService.deleteUserService(id);
    }

}
