package com.example.superwoman.dao;

import com.example.superwoman.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    User selectUserByName(String name);

    @Insert("INSERT INTO user(username, password) VALUES(#{username}, #{password})")
    int insertHappiness(@Param("username") String username, @Param("password") Integer password);

}
