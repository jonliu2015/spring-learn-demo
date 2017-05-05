package liuz.spring.demo.dao;

import liuz.spring.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Liu.Zheng on 2017/3/6.
 */
public interface UserDao extends JpaRepository<User, Long> {
}
