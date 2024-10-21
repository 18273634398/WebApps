package com.hutb.webapp.Mapper;

import com.hutb.webapp.Pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    @Select("Select isAdmin from user where id = #{id}")
    public Integer isAdmin(@Param("id") Integer id);

    @Insert("INSERT INTO blog(title, summary,date,author,content,isTop,comment) VALUES(#{title},#{summary},#{date},#{author},#{content},#{isTop},'[]')")
    public Integer addBlog(Blog blog);

    @Select("SELECT * FROM blog WHERE (content like #{content} or title like #{content} or author like #{content} or summary like #{content})")
    public List<Blog> findBlogByContent(@Param("content") String content);

    @Update("UPDATE blog SET comment = JSON_ARRAY_APPEND(comment, '$', JSON_OBJECT('userId', #{userId}, 'comment', #{comment},'timeAndPosition',#{timeAndPosition})) WHERE id = #{id}")
    public Integer addComment(@Param("id") Integer id,@Param("userId") String userId,@Param("comment") String comment,@Param("timeAndPosition") String timeAndPosition);

}
