package com.hutb.webapp.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String message;
    private int code;
    private Object data;
    public static Message success(){
        return new Message("success", 200, null);
    }
    public static Message success(Object data){
        return new Message("success", 200, data);
    }
    public static Message error(){
        return new Message("error", 500, null);
    }
    public static Message error(Object data){
        return new Message("error", 500, data);
    }
}