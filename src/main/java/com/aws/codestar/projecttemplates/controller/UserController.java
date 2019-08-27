package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.model.User;
import com.aws.codestar.projecttemplates.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserRepository repository;

    public UserController(UserRepository repo) {
        this.repository = repo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List findAll(){
        return repository.findAll();
    }

    @PostMapping
    public User create(User user){
//        user.setName("name");
//        user.setLast_name("last");
//        user.setIdentification("123");
//        user.setEmail("asd");
//        user.setPassword("pass");
        return repository.save(user);
    }

}
