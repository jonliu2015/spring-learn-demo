package edu.zju.liuz.service;

import edu.zju.liuz.dao.UserDao;
import edu.zju.liuz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/12.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User getOneUser(long id) {
        return null;
    }

    public List<User> getAllUser() {
        return userDao.findAll();
    }
}
