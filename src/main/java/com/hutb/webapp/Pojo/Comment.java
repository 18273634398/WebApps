package com.hutb.webapp.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment{
    private int id; // 博客ID
    private String userId;  // 用户ID
    private String comment;  //评论内容
    private String timeAndPosition;  //评论位置
}
