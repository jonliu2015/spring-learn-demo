package edu.zju.liuz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/5/13.
 */
@Configuration
@ComponentScan(basePackages = {"edu.zju.liuz.aspect", "edu.zju.liuz.service"})
@EnableAspectJAutoProxy
public class AopConfig {
}
