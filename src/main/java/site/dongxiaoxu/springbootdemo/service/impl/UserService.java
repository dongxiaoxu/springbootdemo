package site.dongxiaoxu.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.dongxiaoxu.springbootdemo.dao.IUserDao;
import site.dongxiaoxu.springbootdemo.service.IUserService;
import site.dongxiaoxu.springbootdemo.model.User;

import java.util.List;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> getUsers() {
        return this.userDao.findAll();
    }

    @Override
    public User getUser(String userName) {
        return this.userDao.findTopByUserName(userName);
    }

    @Override
    public User saveOrUpdateUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public void deleteUser(String id) {
        this.userDao.deleteById(id);
    }

    @Override
    @Transactional
    public User saveUserWithTransation(User user) {
        User savedUser = this.userDao.save(user);
        int i =1/0;
        return savedUser;
    }
}
