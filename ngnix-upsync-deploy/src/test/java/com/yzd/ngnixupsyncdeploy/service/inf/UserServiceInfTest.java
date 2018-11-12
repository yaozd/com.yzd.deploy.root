package com.yzd.ngnixupsyncdeploy.service.inf;

import com.yzd.ngnixupsyncdeploy.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceInfTest {

    @Autowired
    UserServiceInf userServiceInf;

    @Test
    public void addUser() {
        User user=new User();
        user.setPassword("222xxx");
        user.setUserName("xxx");
        user.setPhone("xx");
        userServiceInf.addUser(user);
    }

    @Test
    public void findAllUser() {
    }
}