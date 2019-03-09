package site.dongxiaoxu.springbootdemo.site.dongxiaoxu.service;

import site.dongxiaoxu.springbootdemo.site.dongxiaoxu.model.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers();

    User getUser(String userName);

    User saveOrUpdateUser(User user);

    void deleteUser(String id);

    User saveUserWithTransation(User user);

}
