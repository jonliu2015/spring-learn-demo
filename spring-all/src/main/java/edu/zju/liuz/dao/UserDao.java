package edu.zju.liuz.dao;

import edu.zju.liuz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Liu.Zheng on 2017/3/6.
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
