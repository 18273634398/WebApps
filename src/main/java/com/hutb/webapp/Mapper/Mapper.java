package com.hutb.webapp.Mapper;

import com.hutb.webapp.Pojo.Blog;
import com.hutb.webapp.Pojo.SignInRequest;
import com.hutb.webapp.Pojo.SignUpRequest;
import com.hutb.webapp.Pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    //定义接口

    // 根据账号查询用户 返回查询到的结果数
    @Select("SELECT * FROM user WHERE id = #{id}")
    public User findUserById(@Param("id") String id);

    // 根据账号和密码查询用户 返回查询到的结果数
    @Select("SELECT id,password FROM user WHERE id = #{id} AND password = #{password}")
    public User signIn(SignInRequest signInRequest);
    // 使用对象作为参数时，需要保证对象中属性与SQL语句中的参数名一致

    @Insert("INSERT INTO user(id, password,email) VALUES(#{id}, #{password},#{email})")
    //public Integer addUser(@Param("id") Integer id,@Param("password") String password,@Param("email") String email);
    public Integer addUser(SignUpRequest signUpRequest);

    @Select("SELECT * FROM blog WHERE isTop = 1")
    public List<Blog> findTopBlog();

    @Select("SELECT * FROM blog WHERE id = #{id}")
    public Blog findBlogById(@Param("id") Integer id);
}