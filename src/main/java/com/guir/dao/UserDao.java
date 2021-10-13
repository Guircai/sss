package com.guir.dao;

import com.guir.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description：
 * Author: Guir
 * Create: 2021/10/13 2:11
 * <User,Integer>：user表示想操作哪个实体类，Integer，表示user类里面的主键
 **/

public interface UserDao extends JpaRepository<User,Integer> {

}
