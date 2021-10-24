package com.example.HelloSpringBoot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    List<User> userList = new ArrayList<>(Arrays.asList(new User("Nada", "853"),
            new User("Hejer", "678"),new User("Khady", "998"))));

    public List<User> getUserList() {
        return userList;
    }

    public void addUserList(User user) {
        userList.add(user);
    }

    public String getUerId(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user.getUserId();
            }
        }
        return "";
    }
}
