package com.todoapp.service;

import com.todoapp.model.User;
import com.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsersService(){
        return userRepository.findAll();
    }

    public Optional<User> getUserByIdService(Long id){
        return userRepository.findById(id);
    }

    public User saveUserService(User user){
        return userRepository.save(user);
    }

    public void deleteUserService(Long id){
        userRepository.deleteById(id);
    }
}
