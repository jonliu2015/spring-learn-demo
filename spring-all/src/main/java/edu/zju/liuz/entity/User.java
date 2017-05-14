package edu.zju.liuz.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Liu.Zheng on 2017/3/6.
 */
@Entity(name = "user")
@Setter
@Getter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String password;
    private int age;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_role_map",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private List<Role> roles;

}
