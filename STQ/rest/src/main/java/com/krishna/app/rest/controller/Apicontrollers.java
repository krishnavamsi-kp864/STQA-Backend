package com.krishna.app.rest.controller;


import com.krishna.app.rest.Models.LoginUser;

import com.krishna.app.rest.Repo.LoginuserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class Apicontrollers {
   

    @Autowired
    LoginuserRepo loginUserRepo;
    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }
    @GetMapping(value="/users")

    public List<LoginUser> getUsers(){

        return loginUserRepo.findAll();

    }
@GetMapping(value="/find/{username}/{password}")
public Optional<LoginUser> getUsersByNameAndPassword(@PathVariable String username, @PathVariable String password ){

    Optional<LoginUser> loginValidation;
    loginValidation = loginUserRepo.findByUsernameAndPassword(username, password);
    return loginValidation;

}



    @PostMapping(value="/save")
    public String saveUsers(@RequestBody LoginUser loginuser){

        loginUserRepo.save(loginuser);
        return "saved with no error";
    }
}
