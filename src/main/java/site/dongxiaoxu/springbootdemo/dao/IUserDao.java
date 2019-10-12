package site.dongxiaoxu.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.dongxiaoxu.springbootdemo.model.User;

@Repository
public interface IUserDao extends JpaRepository<User, String> {

    User findTopByUserName(String userName);
}
