package edu.zju.liuz.config;


import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/5/13.
 */
@Configuration
public class DaoConfig {
    @Autowired
    private Environment env;

    @Primary
    @Bean
    public DataSource dataSource() {
        DruidAbstractDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        return dataSource;

    }
}
