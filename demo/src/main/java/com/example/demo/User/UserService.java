package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){

        return userRepository.findAll();
    }

    public void addNewUser(User user) {

        if (user.getEmail() == null){
            throw  (null);
        }

        userRepository.findUserByEmail(user.getEmail());
        System.out.println(user);
    }
}
