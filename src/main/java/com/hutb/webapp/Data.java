package com.hutb.webapp;

public class Data {

    public static String blogHtml="<!DOCTYPE html>\n" +
            "<html lang=\"zh-CN\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>文章标题</title>\n" +
            "    <style>\n" +
            "        body {\n" +
            "            font-family: 'Arial', sans-serif;\n" +
            "            line-height: 1.6;\n" +
            "            margin: 0;\n" +
            "            padding: 0;\n" +
            "            background: #f4f4f4;\n" +
            "            color: #333;\n" +
            "        }\n" +
            "\n" +
            "        #container {\n" +
            "            width: 1200px; /* 设置版心宽度 */\n" +
            "            min-height: 955.5px; /* 设置版心最小高度 */\n" +
            "            margin: 0 auto;\n" +
            "            padding: 0 20px;\n" +
            "            background-color: #fff;\n" +
            "            overflow: auto; /* 确保内容超出时可以滚动 */\n" +
            "        }\n" +
            "\n" +
            "        .header {\n" +
            "            text-align: center;\n" +
            "            padding-bottom: 20px;\n" +
            "            border-bottom: 1px solid #eaeaea;\n" +
            "        }\n" +
            "\n" +
            "        .header {\n" +
            "            display: flex;\n" +
            "            justify-content: space-between;\n" +
            "            align-items: center;\n" +
            "            padding: 20px 0;\n" +
            "            border-bottom: 2px solid #d33837;\n" +
            "            background-color: #fff;\n" +
            "            /* box-shadow: 0 2px 4px rgba(0,0,0,0.1); */\n" +
            "        }\n" +
            "\n" +
            "        #topTitle {\n" +
            "            margin-left: 2em;\n" +
            "            font-size: 28px;\n" +
            "            color: #d33837;\n" +
            "        }\n" +
            "\n" +
            "        .headers h1 {\n" +
            "            margin: 20px 0 0 0;\n" +
            "            font-size: 2.0em;\n" +
            "            font-weight: bold;\n" +
            "            color: #333;\n" +
            "        }\n" +
            "\n" +
            "        .header img {\n" +
            "            width: 60px;\n" +
            "            height: 60px;\n" +
            "            border-radius: 50%;\n" +
            "            cursor: pointer;\n" +
            "        }\n" +
            "\n" +
            "        .header p {\n" +
            "            color: #a4a4a4;\n" +
            "            font-size: 0.9em;\n" +
            "        }\n" +
            "\n" +
            "        .textContent {\n" +
            "            text-indent: 2em;\n" +
            "            line-height: 1.8;\n" +
            "            font-size: 1.1em;\n" +
            "            margin-top: 20px;\n" +
            "        }\n" +
            "\n" +
            "        .textAuthor {\n" +
            "            color: #a4a4a4;\n" +
            "            font-size: 0.9em;\n" +
            "            margin-left: 10px;\n" +
            "        }\n" +
            "\n" +
            "        .textDate {\n" +
            "            color: #a4a4a4;\n" +
            "            font-size: 0.9em;\n" +
            "            margin-left: 10px;\n" +
            "        }\n" +
            "\n" +
            "        .image-placeholder {\n" +
            "            text-align: center;\n" +
            "            margin-top: 20px;\n" +
            "            max-width: 100%;\n" +
            "            height: auto;\n" +
            "        }\n" +
            "\n" +
            "        #comments-section {\n" +
            "            margin-top: 20px;\n" +
            "            padding: 10px;\n" +
            "            background-color: #fff;\n" +
            "            border-radius: 5px;\n" +
            "            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n" +
            "        }\n" +
            "\n" +
            "        .comment-box {\n" +
            "            display: flex;\n" +
            "            align-items: center;\n" +
            "            margin-bottom: 10px;\n" +
            "        }\n" +
            "\n" +
            "        #new-comment {\n" +
            "            flex: 1;\n" +
            "            padding: 10px;\n" +
            "            border: 1px solid #ddd;\n" +
            "            border-radius: 5px;\n" +
            "            margin-right: 10px;\n" +
            "        }\n" +
            "\n" +
            "        #post-comment {\n" +
            "            padding: 10px 20px;\n" +
            "            background-color: #f4f4f4;\n" +
            "            border: none;\n" +
            "            border-radius: 5px;\n" +
            "            cursor: pointer;\n" +
            "            font-weight: bold;\n" +
            "        }\n" +
            "\n" +
            "        .comment {\n" +
            "            margin: 10 0 px;\n" +
            "            padding: 10px;\n" +
            "            border-bottom: 1px solid #eee;\n" +
            "        }\n" +
            "\n" +
            "        .comment-header {\n" +
            "            display: flex;\n" +
            "            justify-content: space-between;\n" +
            "            margin-bottom: 5px;\n" +
            "        }\n" +
            "\n" +
            "        .comment-user {\n" +
            "            font-weight: bold;\n" +
            "        }\n" +
            "\n" +
            "        .comment-time {\n" +
            "            color: #888;\n" +
            "            font-size: 0.9em;\n" +
            "        }\n" +
            "\n" +
            "        .comment-content {\n" +
            "            margin: 5 0px;\n" +
            "            padding: 10px;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<!-- 导入Vue开发环境版本，包含了有帮助的命令行警告 -->\n" +
            "<script src=\"https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js\"></script>\n" +
            "<!-- 导入jquery库，用于发送Ajax请求 -->\n" +
            "<script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\n" +
            "<body>\n" +
            "<div id=\"container\">\n" +
            "    <div class=\"headers\">\n" +
            "        <div class=\"header\">\n" +
            "            <h1 id=\"topTitle\">鲁博客 - 个人博客网</h1>\n" +
            "            <img src=\"https://img.picui.cn/free/2024/10/19/6713cb42a9def.jpeg\" alt=\"用户头像\" id=\"menu-icon\">\n" +
            "        </div>\n" +
            "        <h1 class=\"textTitle\" v-text=\"textTitle\"></h1>\n" +
            "        <p>\n" +
            "            <span class=\"textDate\" id=\"\" v-text=\"textDate\"></span>\n" +
            "            <span>&nbsp;&nbsp;</span>\n" +
            "            <span class=\"textAuthor\" v-text=\"textAuthor\"></span>\n" +
            "        </p>\n" +
            "    </div>\n" +
            "    <div class=\"image-placeholder\" v-show=\"srcImg\">\n" +
            "        <img :src=\"srcImg\" :alt=\"srcImgDesc\">\n" +
            "    </div>\n" +
            "    <div class=\"textContent\">\n" +
            "        <p class=\"text-content\" v-text=\"textContent\"></p>\n" +
            "    </div>\n" +
            "    <div class=\"video-placeholder\" v-show=\"srcVedio\">\n" +
            "        <video controls>\n" +
            "            <source :src=\"srcVedio\" type=\"video/mp4\">\n" +
            "            您的浏览器不支持视频播放。\n" +
            "        </video>\n" +
            "    </div>\n" +
            "    <!-- 评论区 -->\n" +
            "    <div id=\"comments-section\">\n" +
            "        <div class=\"comment-box\">\n" +
            "            <input type=\"text\" id=\"new-comment\" placeholder=\"发布你的评论\" v-model=\"commentContent\" @keyup.enter=\"submitComment\"></input>\n" +
            "            <button id=\"post-comment\" @click=\"submitComment\">评论</button>\n" +
            "        </div>\n" +
            "        <div class=\"comment-list\">\n" +
            "            <div class=\"comment\">\n" +
            "                <div class=\"comment-header\">\n" +
            "                    <span class=\"comment-user\">用户名</span>\n" +
            "                    <span class=\"comment-time\">时间 地址</span>\n" +
            "                </div>\n" +
            "                <div class=\"comment-content\">\n" +
            "                    评论内容\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <!-- 更多评论 -->\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "</body>\n" +
            "<script>\n" +
            "    new Vue({\n" +
            "        el: '#container',\n" +
            "        data: {\n" +
            "            id:'',\n" +
            "            textTitle: '文章标题',\n" +
            "            textDate: '2024-10-19',\n" +
            "            textAuthor: '作者',\n" +
            "            textContent: '文章内容',\n" +
            "            srcImg: '',\n" +
            "            srcVedio: '',\n" +
            "            srcImgDesc: '图片描述',\n" +
            "            commentContent:'',\n" +
            "            time:'' // 时间戳：用于评论的时间\n" +
            "        },\n" +
            "        mounted: function getBlogTop() {\n" +
            "            var currentUrl = window.location.href;\n" +
            "            var id = currentUrl.split(\"blog_\")[1];\n" +
            "            this.id = id;\n" +
            "            if (id != -1) {\n" +
            "                var url = \"http://localhost:8080/api/blog/id=\";\n" +
            "                url += id;\n" +
            "                console.log(url);\n" +
            "                $.ajax({\n" +
            "                    url: url,\n" +
            "                    type: \"get\",\n" +
            "                    success: function (result) {\n" +
            "                        this.textTitle = result.title;   // 更新文章标题\n" +
            "                        this.textDate = result.date;     // 更新日期\n" +
            "                        this.textAuthor = result.author;  // 更新作者\n" +
            "                        this.textContent = result.content; // 更新内容\n" +
            "                        this.srcImg = result.image;       // 更新图片地址\n" +
            "                        this.srcVedio = result.video;     // 更新视频地址\n" +
            "                        this.srcImgDesc = result.imageDesc; // 更新图片描述\n" +
            "                        if (result.comment && result.comment.length > 0) {\n" +
            "                            // 在这部分需要完成评论列表的渲染\n" +
            "                            const commentSection = document.querySelector('.comment-list');\n" +
            "                            commentSection.innerHTML = ''; // 清空现有内容\n" +
            "                            JSON.parse(result.comment).forEach(data => {\n" +
            "                                const comment = document.createElement('div');\n" +
            "                                comment.classList.add('comment');\n" +
            "                                comment.innerHTML = `\n" +
            "                                    <div class=\"comment-header\">\n" +
            "                                        <span class=\"comment-user\">${data.userId}</span>\n" +
            "                                        <span class=\"comment-time\">${data.timeAndPosition}</span>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"comment-content\">${data.comment}</div>\n" +
            "                                `;\n" +
            "                                commentSection.appendChild(comment);\n" +
            "                            });\n" +
            "                        } else {\n" +
            "                            const commentSection = document.querySelector('.comment-list');\n" +
            "                            commentSection.innerHTML = ''; // 清空现有内容\n" +
            "                            console.log(\"没有评论\");\n" +
            "                        }\n" +
            "                    }.bind(this)  // 绑定 this 到当前 Vue 实例\n" +
            "                });\n" +
            "            } else {\n" +
            "                alert(\"当前页面不存在\")\n" +
            "                window.location.href = \"./mainFrame.html\";\n" +
            "            }\n" +
            "        },\n" +
            "        methods: {\n" +
            "            getTime: function () {\n" +
            "                this.time = new Date().toLocaleString();\n" +
            "            },\n" +
            "            submitComment: function() {\n" +
            "                this.getTime(); // 获取当前时间\n" +
            "                const url = 'http://localhost:8080/api/blog/comment/add';\n" +
            "                $.ajax({\n" +
            "                    url: url,\n" +
            "                    type: \"post\",\n" +
            "                    data: {\n" +
            "                        \"id\": this.id,\n" +
            "                        \"userId\": \"guest\",\n" +
            "                        \"comment\": this.commentContent,\n" +
            "                        \"timeAndPosition\": this.time\n" +
            "                    },\n" +
            "                    success: function(result) {\n" +
            "                        if (result.message == \"success\") {\n" +
            "                            alert(\"发布成功\");\n" +
            "                            location.reload();\n" +
            "                        } else {\n" +
            "                            var errorInfo = result.data;\n" +
            "                            alert(errorInfo);\n" +
            "                        }\n" +
            "                    },\n" +
            "                    error: function(xhr, status, error) {\n" +
            "                        console.error(\"请求失败:\", error); // 错误处理\n" +
            "                    }\n" +
            "                });\n" +
            "            }\n" +
            "\n" +
            "        }\n" +
            "    })\n" +
            "</script>\n" +
            "</html>";
    public static String oldblogHtml="<!DOCTYPE html>\n" +
            "<html lang=\"zh-CN\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>文章标题</title>\n" +
            "    <style>\n" +
            "        body {\n" +
            "            font-family: 'Arial', sans-serif;\n" +
            "            line-height: 1.6;\n" +
            "            margin: 0;\n" +
            "            padding: 0;\n" +
            "            background: #f4f4f4;\n" +
            "            color: #333;\n" +
            "        }\n" +
            "\n" +
            "        #container {\n" +
            "            width: 1200px; /* 设置版心宽度 */\n" +
            "            min-height: 955.5px; /* 设置版心最小高度 */\n" +
            "            margin: 0 auto;\n" +
            "            padding: 0 20px;\n" +
            "            background-color: #fff;\n" +
            "            overflow: auto; /* 确保内容超出时可以滚动 */\n" +
            "        }\n" +
            "\n" +
            "\n" +
            "        .header {\n" +
            "            text-align: center;\n" +
            "            padding-bottom: 20px;\n" +
            "            border-bottom: 1px solid #eaeaea;\n" +
            "        }\n" +
            "\n" +
            "        .header {\n" +
            "            display: flex;\n" +
            "            justify-content: space-between;\n" +
            "            align-items: center;\n" +
            "            padding: 20px 0;\n" +
            "            border-bottom: 2px solid #d33837;\n" +
            "            background-color: #fff;\n" +
            "            /* box-shadow: 0 2px 4px rgba(0,0,0,0.1); */\n" +
            "        }\n" +
            "        #topTitle {\n" +
            "            margin-left: 2em;\n" +
            "            font-size: 28px;\n" +
            "            color: #d33837;\n" +
            "        }\n" +
            "        .headers h1 {\n" +
            "            margin: 20px 0 0 0;\n" +
            "            font-size: 2.0em;\n" +
            "            font-weight: bold;\n" +
            "            color: #333;\n" +
            "        }\n" +
            "        .header img {\n" +
            "            width: 60px;\n" +
            "            height: 60px;\n" +
            "            border-radius: 50%;\n" +
            "            cursor: pointer;\n" +
            "        }\n" +
            "        .header p {\n" +
            "            color: #a4a4a4;\n" +
            "            font-size: 0.9em;\n" +
            "        }\n" +
            "       .textContent {\n" +
            "            text-indent: 2em;\n" +
            "            line-height: 1.8;\n" +
            "            font-size: 1.1em;\n" +
            "            margin-top: 20px;\n" +
            "        }\n" +
            "        .textAuthor{\n" +
            "            color: #a4a4a4;\n" +
            "            font-size: 0.9em;\n" +
            "            margin-left: 10px;\n" +
            "        }\n" +
            "        .textDate{\n" +
            "            color: #a4a4a4;\n" +
            "            font-size: 0.9em;\n" +
            "            margin-left: 10px;\n" +
            "        }\n" +
            "        .image-placeholder {\n" +
            "            text-align: center;\n" +
            "            margin-top: 20px;\n" +
            "            max-width: 100%;\n" +
            "            height: auto;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<!-- 导入Vue开发环境版本，包含了有帮助的命令行警告 -->\n" +
            "<script src=\"https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js\"></script>\n" +
            "<script src=\"https://code.jquery.com/jquery-3.0.0.min.js\"></script>\n" +
            "<body>\n" +
            "<div id=\"container\">\n" +
            "    <div class=\"headers\">\n" +
            "        <div class=\"header\">\n" +
            "            <h1 id=\"topTitle\">鲁博客 - 个人博客网</h1>\n" +
            "            <img src=\"https://img.picui.cn/free/2024/10/19/6713cb42a9def.jpeg\" alt=\"用户头像\" id=\"menu-icon\">\n" +
            "        </div>\n" +
            "        <h1 class=\"textTitle\" v-text=\"textTitle\"></h1>\n" +
            "        <p>\n" +
            "            <span class=\"textDate\" id=\"\" v-text=\"textDate\"></span>\n" +
            "            <span>&nbsp;&nbsp;</span>\n" +
            "            <span class=\"textAuthor\" v-text=\"textAuthor\"></span>\n" +
            "        </p>\n" +
            "    </div>\n" +
            "    <div class=\"image-placeholder\" v-show=\"srcImg\">\n" +
            "        <img :src=\"srcImg\" :alt=\"srcImgDesc\">\n" +
            "    </div>\n" +
            "    <div class=\"textContent\">\n" +
            "        <p class=\"text-content\" v-text=\"textContent\"></p>\n" +
            "    </div>\n" +
            "    <div class=\"video-placeholder\" v-show=\"srcVedio\">\n" +
            "        <video controls>\n" +
            "            <source :src=\"srcVedio\" type=\"video/mp4\">\n" +
            "            您的浏览器不支持视频播放。\n" +
            "        </video>\n" +
            "    </div>\n" +
            "</div>\n" +
            "</body>\n" +
            "<script>\n" +
            "    new Vue({\n" +
            "        el: '#container',\n" +
            "        data: {\n" +
            "            textTitle: '文章标题',\n" +
            "            textDate: '2024-10-19',\n" +
            "            textAuthor: '作者',\n" +
            "            textContent: '文章内容',\n" +
            "            srcImg: '',\n" +
            "            srcVedio: '',\n" +
            "            srcImgDesc: '图片描述'\n" +
            "        },\n" +
            "        mounted: function getBlogTop() {\n" +
            "            var currentUrl = window.location.href;\n" +
            "            var id = currentUrl.split(\"blog_\")[1];\n" +
            "            if (id!=-1) {\n" +
            "                var url = \"http://localhost:8080/api/blog/id=\";\n" +
            "                url += id;\n" +
            "                console.log(url);\n" +
            "                $.ajax({\n" +
            "                    url: url,\n" +
            "                    type: \"get\",\n" +
            "                    success: function (result) {\n" +
            "                        console.log(result);\n" +
            "                        this.textTitle = result.title;   // 更新文章标题\n" +
            "                        this.textDate = result.date;     // 更新日期\n" +
            "                        this.textAuthor = result.author;  // 更新作者\n" +
            "                        this.textContent = result.content; // 更新内容\n" +
            "                        this.srcImg = result.image;       // 更新图片地址\n" +
            "                        this.srcVedio = result.video;     // 更新视频地址\n" +
            "                        this.srcImgDesc = result.imageDesc; // 更新图片描述\n" +
            "                    }.bind(this)  // 绑定 this 到当前 Vue 实例\n" +
            "                });\n" +
            "            } else {\n" +
            "                alert(\"当前页面不存在\")\n" +
            "                window.location.href = \"./mainFrame.html\";\n" +
            "            }\n" +
            "        },\n" +
            "        methods: {}\n" +
            "    })\n" +
            "</script>\n" +
            "</html>";
    public static String signalPageHtml="";
}
