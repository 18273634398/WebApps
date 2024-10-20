package com.hutb.webapp.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private int id;             // 博客id
    private String title;       // 博客标题
    private String type;        // 博客类型
    private String summary;     // 博客摘要
    private String content;     // 博客内容
    private String author;      // 博客作者
    private String date;        // 博客日期
    private String srcImg;      // 博客图片地址
    private String srcImgDesc;  // 博客图片描述
    private String srcVedio;    // 博客视频地址
    private int isTop;          // 是否置顶
}
