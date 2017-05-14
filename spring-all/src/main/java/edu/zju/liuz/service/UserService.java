package edu.zju.liuz.service;

import edu.zju.liuz.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
public interface UserService {
    User getOneUser(long id);
    List<User> getAllUser();
}
