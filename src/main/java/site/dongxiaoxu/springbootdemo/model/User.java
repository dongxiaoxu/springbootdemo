package site.dongxiaoxu.springbootdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sys_user")
@Data
public class User extends BaseModel{

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    private Date birthday;
}
