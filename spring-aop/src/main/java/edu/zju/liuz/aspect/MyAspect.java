package edu.zju.liuz.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/13.
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut(value = "execution(* edu.zju.liuz.service.MyServiceImpl.sleep(..))")
    void aspect() {}

    @Before(value = "aspect()")
    public void before() {
        System.err.println("I'm brushing my teeth before sleeping");
    }

}
