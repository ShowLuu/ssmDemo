package com.springboot.ssm.dao;

import com.springboot.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user where Id=#{id}")
    List<User> findAll(User id);

    List<User> findAlls();

}
