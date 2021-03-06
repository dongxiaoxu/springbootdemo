package site.dongxiaoxu.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.dongxiaoxu.springbootdemo.config.UserInfo;
import site.dongxiaoxu.springbootdemo.config.UserInfoParam;
import site.dongxiaoxu.springbootdemo.model.User;
import site.dongxiaoxu.springbootdemo.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    @GetMapping("/getUserInfo")
    public Map<String, Object> getUserInfo(@UserInfoParam UserInfo userInfo, HttpServletRequest request, String userName) throws IOException {
        Map<String, Object> rltMap = new HashMap<>();

        rltMap.put("message", userInfo.getDisplayName());
        return rltMap;
    }

}
