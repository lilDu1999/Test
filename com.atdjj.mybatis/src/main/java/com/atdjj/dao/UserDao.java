package com.atdjj.dao;

import com.atdjj.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
    @Select("select *from where id=#{id}")
    List<User> findById(User user);
}
