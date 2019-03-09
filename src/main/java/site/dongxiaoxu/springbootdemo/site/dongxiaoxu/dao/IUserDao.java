package site.dongxiaoxu.springbootdemo.site.dongxiaoxu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.dongxiaoxu.springbootdemo.site.dongxiaoxu.model.User;

@Repository
public interface IUserDao extends JpaRepository<User, String> {

    User findTopByUserName(String userName);
}
