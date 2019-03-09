package site.dongxiaoxu.springbootdemo.site.dongxiaoxu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.dongxiaoxu.springbootdemo.site.dongxiaoxu.model.User;
import site.dongxiaoxu.springbootdemo.site.dongxiaoxu.service.IUserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private IUserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/getUser/{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        return this.userService.getUser(userName);
    }

    @PostMapping("/saveUser")
    public User saveUser(User user) {
        return this.userService.saveOrUpdateUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(User user) {
        return this.userService.saveOrUpdateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") String id) {
        this.userService.deleteUser(id);
    }


}
