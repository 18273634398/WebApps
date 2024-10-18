package com.hutb.webapp.Mapper;

import com.hutb.webapp.Pojo.SignInRequest;
import com.hutb.webapp.Pojo.SignUpRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //定义接口

    // 根据账号查询用户 返回查询到的结果数
    @Select("SELECT * FROM user WHERE id = #{id}")
    public Integer findUserById(@Param("id") Integer id);

    // 根据账号和密码查询用户 返回查询到的结果数
    @Select("SELECT * FROM user WHERE id = #{id} AND password = #{password}")
    public Integer signIn(SignInRequest signInRequest);

    @Insert("INSERT INTO user(id, password,email) VALUES(#{id}, #{password},#{email})")
    //public Integer addUser(@Param("id") Integer id,@Param("password") String password,@Param("email") String email);
    public Integer addUser(SignUpRequest signUpRequest);
}
