package com.pl.dao;

import com.pl.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("Add");
    }

    @Override
    public void delUser() {
        System.out.println("del");
    }
}
