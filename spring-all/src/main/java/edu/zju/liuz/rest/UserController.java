package edu.zju.liuz.rest;

import edu.zju.liuz.entity.User;
import edu.zju.liuz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/6.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUser();
    }

}
