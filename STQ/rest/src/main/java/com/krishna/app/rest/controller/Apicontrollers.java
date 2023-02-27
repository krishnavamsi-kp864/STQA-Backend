package com.krishna.app.rest.controller;


import com.krishna.app.rest.Models.User;
import com.krishna.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Apicontrollers {
    @Autowired
    private UserRepo userRepo;
    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }
    @GetMapping(value="/users")

    public List<User> getUsers(){

        return userRepo.findAll();
    }

//    @GetMapping(value="/users/id")
//
//    public List<User> getUsersById(@RequestParam int id){
//
//        return userRepo.findbyId(id);
//    }

    @PostMapping(value="/save")
    public String saveUsers(@RequestBody User user){

        userRepo.save(user);
        return "saved with no error";
    }
}
