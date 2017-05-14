package edu.zju.liuz;

import edu.zju.liuz.config.AopConfig;
import edu.zju.liuz.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/5/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class TestAop {
    @Autowired
    private MyService myService;

    @Test
    public void testMy() {
        myService.sleep();
    }
}
