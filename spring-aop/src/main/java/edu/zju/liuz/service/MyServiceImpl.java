package edu.zju.liuz.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service
public class MyServiceImpl implements MyService {
    public void sleep() {
        System.out.println("I'm going to sleep.");
    }
}
