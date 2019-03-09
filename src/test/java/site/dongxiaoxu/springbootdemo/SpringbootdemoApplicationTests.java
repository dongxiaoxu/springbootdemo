package site.dongxiaoxu.springbootdemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import site.dongxiaoxu.springbootdemo.site.dongxiaoxu.model.User;
import site.dongxiaoxu.springbootdemo.site.dongxiaoxu.service.IUserService;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private IUserService userService;

    private MockMvc mockMvc;

    @Before
    public void startup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testGetUser() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/getUsers")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(4));

    }

    @Test
    public void testSaveUser() {
        User user;
        user = new User();
        user.setUserName("dongxiaoxu");
        user.setPassword("123");
        user.setBirthday(new Date());
        userService.saveUserWithTransation(user);
    }

}
