package edu.zju.liuz;


import edu.zju.liuz.dao.UserDao;
import edu.zju.liuz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestAll {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Test
    public void getUser() {
        long id = 1;
        System.err.println(userService.getAllUser());
    }


}
