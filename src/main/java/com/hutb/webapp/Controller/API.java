package com.hutb.webapp.Controller;

import com.hutb.webapp.Mapper.UserMapper;
import com.hutb.webapp.Pojo.Message;
import com.hutb.webapp.Pojo.SignInRequest;
import com.hutb.webapp.Pojo.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static com.hutb.webapp.Pojo.Message.success;

@RestController
public class API {
    @Autowired
    private UserMapper userMapper;
    // 【实际API】
    // 登录API
    @RequestMapping(value = "/signIn")
    // 接受参数的原则都是保证前端传递数据的参数名和后端的一致
    // public Message SignIn(String username, String password) { SpringBoot 方法1
    public Message SignIn(SignInRequest request) { // SpringBoot 方法2 面向对象
        System.out.println("Get a signIn request");
        if (!(userMapper.signIn(request)== null)) {
            return success("Login success");
        }
        else {
            return success("Login failed,Account or password error");
        }
    }

    @RequestMapping(value = "/signUp",method = RequestMethod.POST)
    public Message SignUp(SignUpRequest request) {
        System.out.println("Get a signUp request");
        Integer id = userMapper.findUserById(request.getId());
        if(userMapper.findUserById(id) == null){ // 判断账号是否已经存在
            Integer result = userMapper.addUser(request);
            System.out.println("result: "+result);
            if(result!=null) // 注册成功
                return success("SignUp success");
            else // 注册失败
                return new Message("SignUp failed",500,"Server Error");
        }
        else{
            return success("SignUp failed,Because the id has been used");
        }
    }



    // 【虚拟API：用于记录学习笔记】
    // 解析普通参数API
    // 要求前端传递参数 且参数名为 message
    @RequestMapping(value = "/vAPI/parseParam")
    public String parseParam(String message) {
        System.out.println("Get vAPI parseParam request");
        System.out.println(message);
        return "OK";
    }



    // 解析对象参数API
    // 要求前端传递参数 且前端传回的参数列表中的名称与后端定义的对象的属性名称一致
    @RequestMapping(value = "/vAPI/parseObject")
    public String parseObject(SignInRequest request) {
        System.out.println("Get a parseObject request");
        System.out.println(request.getId());
        System.out.println(request.getPassword());
        return "OK";
    }



    // 解析数组参数API
    // 要求前端传递参数 且前端传回的参数列表中的名称与后端定义的数组的元素名称一致
    @RequestMapping(value = "/vAPI/parseArray")
    public String parseArray(String[] array) {
        System.out.println("Get a parseArray request");
        for (String str : array) {
            System.out.println(str);
        }
        return "OK";
    }



    // 解析时间API
    @RequestMapping(value = "/vAPI/getTime")
    public String getTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println("Get a getTime request");
        System.out.println(updateTime);
        return "OK";
    }



    // 解析JSON API
    @RequestMapping(value = "/vAPI/parseJSON1", method = RequestMethod.POST)
    public String parseJSO1(@RequestBody String json) {
        System.out.println("Get a parseJSON request");
        System.out.println(json);
        return"OK";
    }
    @RequestMapping(value = "/vAPI/parseJSON2", method = RequestMethod.POST)
    public String parseJSON2(@RequestBody SignUpRequest request) {
        System.out.println("Get a parseJSON request");
        System.out.println(request.getId());
        System.out.println(request.getPassword());
        System.out.println(request.getEmail());
        return"OK";
    }


    // 路径参数解析API
    // 用于接受路径参数 id
    @RequestMapping(value = "/vAPI/path/{idValue}")
    public String pathParam(@PathVariable("idValue") int id) {
        System.out.println("Get a pathParam request");
        System.out.println(id);
        return "OK";
    }
    // 接受路径参数 id 和 name
    @RequestMapping(value = "/vAPI/path/{idValue}/{name}")
    public String pathParam(@PathVariable("idValue") int id ,@PathVariable("name") String name) {
        System.out.println("Get a pathParam request");
        System.out.println(id);
        System.out.println(name);
        return "OK";
    }
}







