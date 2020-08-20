package com.pl;

import com.pl.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AspectTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAspect(){
        userDao.addUser();
    }


}
