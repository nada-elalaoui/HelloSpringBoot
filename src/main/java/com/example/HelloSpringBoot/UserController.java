package com.example.HelloSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public User[] getUserList() {
        return userService.getUserList().toArray(new User[0]);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUserList(user);
    }

    @RequestMapping("/users/{Username}")
    public String getUserId(@PathVariable("Username") String username){
        return userService.getUerId(username);
    }
}