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
            "            margin: 10 0px;\n" +
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
            "            margin: 5px 0px;\n" +
            "            padding: 10px;\n" +
            "        }\n" +
            "        /* 弹窗内容样式 */\n" +
            "        .modal-content {\n" +
            "            position: fixed;\n" +
            "            top: 0;\n" +
            "            left: 0;\n" +
            "            right: 0;\n" +
            "            bottom: 0;\n" +
            "            background-color: rgba(255, 255, 255, 0.9); /* 背景色和透明度 */\n" +
            "            padding: 20px;\n" +
            "            border-radius: 5px;\n" +
            "            max-width: 700px; /* 限制最大宽度 */\n" +
            "            width: 70%; /* 占据水平方向70%的空间 */\n" +
            "            max-height: 500px; /* 限制最大高度 */\n" +
            "            height: 50%;\n" +
            "            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n" +
            "            margin: auto; /* 在弹窗中居中 */\n" +
            "            overflow-y: auto; /* 当内容超出高度时显示垂直滚动条 */\n" +
            "            align-self: center;\n" +
            "        }\n" +
            "\n" +
            "        /* 输入框和按钮样式 */\n" +
            "        .modal-input, .modal-button {\n" +
            "            width: 70%;\n" +
            "            padding: 10px;\n" +
            "            margin: 10px;\n" +
            "            border: 1px solid #d33837;\n" +
            "            border-radius: 5px;\n" +
            "        }\n" +
            "\n" +
            "        /* 当输入框或文本域被聚焦时的样式 */\n" +
            "        .modal-input:focus, .modal-button:focus {\n" +
            "            outline: none; /* 移除默认的聚焦轮廓 */\n" +
            "            border-color: #e2b604; /* 设置边框颜色为黄色 */\n" +
            "            box-shadow: 0 0 5px #fdcf30; /* 可选：添加一个黄色的阴影效果 */\n" +
            "        }\n" +
            "\n" +
            "        .modal-button {\n" +
            "            margin-top: 20px;\n" +
            "            background-color: #d33837;\n" +
            "            color: white;\n" +
            "            border: none;\n" +
            "            cursor: pointer;\n" +
            "            transition: background-color 0.3s;\n" +
            "        }\n" +
            "\n" +
            "        .modal-button:hover {\n" +
            "            background-color: #ca2323;\n" +
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
            "        <p class=\"header-info\" style=\"display: flex; justify-content: space-between; align-items: center;\">\n" +
            "            <span class=\"textDate\" id=\"\" v-text=\"textDate\"></span>\n" +
            "            <span>&nbsp;&nbsp;</span>\n" +
            "            <span class=\"textAuthor\" v-text=\"textAuthor\"></span>\n" +
            "            <span style=\"margin-left: auto;\">  <!-- 添加自动左边距，让修改图标右对齐 -->\n" +
            "                <a  class=\"edit-icon\" style=\"text-decoration: none; color: #a4a4a4;margin-right: 30px;\" @click=\"editBlog\">\n" +
            "                    <img src=\"https://img.picui.cn/free/2024/10/24/6719e76bcca18.png\" alt=\"修改\" width=\"20\" height=\"20\">\n" +
            "                </a>\n" +
            "            </span>\n" +
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
            "    <!-- 弹窗 -->\n" +
            "    <div id=\"modal\" v-if=\"modalStatus\" class=\"modal hidden\">\n" +
            "        <div class=\"modal-content\">\n" +
            "            <!-- 弹窗内容 -->\n" +
            "            <p>\n" +
            "                <span>删除：</span>\n" +
            "                <select v-model=\"inputDelete\" class=\"modal-input\" value=\"0\">\n" +
            "                    <option value=\"1\">是</option>\n" +
            "                    <option value=\"0\">否</option>\n" +
            "                </select>\n" +
            "            </p>\n" +
            "            <p v-if=\"inputDelete=='0'\"><span>置顶：</span>\n" +
            "                <select v-model=\"inputIsTop\" class=\"modal-input\">\n" +
            "                    <option value=\"1\">是</option>\n" +
            "                    <option value=\"0\">否</option>\n" +
            "                </select>\n" +
            "            </p>\n" +
            "            <p v-if=\"inputDelete=='0'\"><span>标题：</span><input type=\"text\" v-model=\"inputTitle\" class=\"modal-input\">\n" +
            "            <p v-if=\"inputDelete=='0'\"><span>日期：</span><input type=\"text\" v-model=\"inputDate\" class=\"modal-input\"></p>\n" +
            "            <p v-if=\"inputDelete=='0'\"><span>作者：</span><input type=\"text\" v-model=\"inputAuthor\" class=\"modal-input\"></p>\n" +
            "            <p v-if=\"inputDelete=='0'\"><span>正文：</span><textarea class=\"modal-input\" v-model=\"inputContent\" rows=\"10\"\n" +
            "                                           @keyup.enter=\"submitModal()\"></textarea>\n" +
            "            </p>\n" +
            "            <div class=\"button-container\">\n" +
            "                <button class=\"modal-button cancel\" @click=\"openModal()\">取消</button>\n" +
            "                <button class=\"modal-button\" @click=\"submitModal()\">确认</button>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "    <!-- 评论区 -->\n" +
            "    <div id=\"comments-section\">\n" +
            "        <div class=\"comment-box\">\n" +
            "            <input type=\"text\" id=\"new-comment\" placeholder=\"发布你的评论\" v-model=\"commentContent\"\n" +
            "                   @keyup.enter=\"submitComment\"></input>\n" +
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
            "            id: '',\n" +
            "            textTitle: '文章标题',\n" +
            "            textDate: '2024-10-19',\n" +
            "            textAuthor: '作者',\n" +
            "            textContent: '文章内容',\n" +
            "            srcImg: '',\n" +
            "            srcVedio: '',\n" +
            "            srcImgDesc: '图片描述',\n" +
            "            commentContent: '',\n" +
            "            time: '' ,// 时间戳：用于评论的时间\n" +
            "            modalStatus: false,\n" +
            "            // 以下为弹窗输入框内容，配置默认项\n" +
            "            inputTitle: '',\n" +
            "            inputDate: '',\n" +
            "            inputAuthor: '',\n" +
            "            inputContent: '',\n" +
            "            inputIsTop:1,\n" +
            "            inputDelete:0\n" +
            "        },\n" +
            "        mounted: function getBlogTop() {\n" +
            "            var currentUrl = window.location.href;\n" +
            "            var id = currentUrl.split(\"blog_\")[1];\n" +
            "            this.id = id;\n" +
            "            if (id != -1) {\n" +
            "                var url = \"http://localhost:8080/blog/id=\";\n" +
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
            "            submitComment: function () {\n" +
            "                this.getTime(); // 获取当前时间\n" +
            "                const url = 'http://localhost:8080/blog/comment/add';\n" +
            "                $.ajax({\n" +
            "                    url: url,\n" +
            "                    type: \"post\",\n" +
            "                    data: {\n" +
            "                        \"id\": this.id,\n" +
            "                        \"userId\": \"guest\",\n" +
            "                        \"comment\": this.commentContent,\n" +
            "                        \"timeAndPosition\": this.time\n" +
            "                    },\n" +
            "                    success: function (result) {\n" +
            "                        if (result.message == \"success\") {\n" +
            "                            alert(\"发布成功\");\n" +
            "                            location.reload();\n" +
            "                        } else {\n" +
            "                            var errorInfo = result.data;\n" +
            "                            alert(errorInfo);\n" +
            "                        }\n" +
            "                    },\n" +
            "                    error: function (xhr, status, error) {\n" +
            "                        console.error(\"请求失败:\", error); // 错误处理\n" +
            "                    }\n" +
            "                });\n" +
            "            },\n" +
            "            editBlog: function () {\n" +
            "                this.openModal();\n" +
            "            },\n" +
            "            openModal() {\n" +
            "                this.modalStatus = !this.modalStatus;\n" +
            "                this.inputTitle = this.textTitle;\n" +
            "                this.inputDate = this.textDate;\n" +
            "                this.inputAuthor = this.textAuthor;\n" +
            "                this.inputContent = this.textContent;\n" +
            "            },\n" +
            "            submitModal() {\n" +
            "                if(this.inputDelete=='0'){\n" +
            "                    url = \"http://localhost:8080/blog/update\";\n" +
            "                    $.ajax({\n" +
            "                        url: url,\n" +
            "                        type: \"post\",\n" +
            "                        data: {\n" +
            "                            \"id\":this.id,\n" +
            "                            \"title\": this.inputTitle,\n" +
            "                            \"date\": this.inputDate,\n" +
            "                            \"author\": this.inputAuthor,\n" +
            "                            \"content\": this.inputContent,\n" +
            "                            \"isTop\":this.inputIsTop\n" +
            "                        },\n" +
            "                        success: function (result) {\n" +
            "                            if (result.message == \"success\") {\n" +
            "                                alert(\"更改成功\");\n" +
            "                                window.location.reload();\n" +
            "                            } else {\n" +
            "                                var errorInfo = result.data;\n" +
            "                                alert(errorInfo);\n" +
            "                            }\n" +
            "                        }\n" +
            "                    });\n" +
            "                }\n" +
            "                else{\n" +
            "                    url = \"http://localhost:8080/blog/delete\";\n" +
            "                    $.ajax({\n" +
            "                        url: url,\n" +
            "                        type: \"post\",\n" +
            "                        data: {\n" +
            "                            \"id\":this.id,\n" +
            "                        },\n" +
            "                        success: function (result) {\n" +
            "                            if (result.message == \"success\") {\n" +
            "                                alert(\"删除成功\");\n" +
            "                                window.location.href = \"./mainFrame.html\";\n" +
            "                            } else {\n" +
            "                                var errorInfo = result.data;\n" +
            "                                alert(errorInfo);\n" +
            "                            }\n" +
            "                        }\n" +
            "                    });\n" +
            "                }\n" +
            "            }\n" +
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
            "                var url = \"http://localhost:8080/blog/id=\";\n" +
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
            "                const url = 'http://localhost:8080/blog/comment/add';\n" +
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

    public static String signalPageHtml="<!DOCTYPE html>\n" +
            "<html lang=\"zh-CN\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>个人信息页面</title>\n" +
            "    <style>\n" +
            "        body {\n" +
            "            font-family: Arial, sans-serif;\n" +
            "            margin: 0;\n" +
            "            padding: 0;\n" +
            "            background-color: #f4f4f4;\n" +
            "        }\n" +
            "        .header {\n" +
            "            background-color: #fff;\n" +
            "            padding: 20px;\n" +
            "            display: flex;\n" +
            "            align-items: center;\n" +
            "            border-bottom: 1px solid #ddd;\n" +
            "            background-image: url('https://img.picui.cn/free/2024/10/22/67170f295780a.jpg'); /* 添加背景图片 */\n" +
            "            background-size: cover; /* 确保背景图片覆盖整个容器 */\n" +
            "            background-position: center; /* 背景图片居中显示 */\n" +
            "        }\n" +
            "        .header img {\n" +
            "            width: 100px;\n" +
            "            height: 100px;\n" +
            "            border-radius: 50%;\n" +
            "        }\n" +
            "        .header h1 {\n" +
            "            margin: 0;\n" +
            "            font-size: 24px;\n" +
            "            margin-left: 10px; /* 设置头像和名称之间的间距 */\n" +
            "        }\n" +
            "        .nav {\n" +
            "            display: flex;\n" +
            "            justify-content: space-between;\n" +
            "            background-color: #fff;\n" +
            "            padding: 10px 20px;\n" +
            "            border-bottom: 1px solid #ddd;\n" +
            "        }\n" +
            "        .nav a {\n" +
            "            text-decoration: none;\n" +
            "            color: #333;\n" +
            "            font-size: 16px;\n" +
            "        }\n" +
            "        .main-content {\n" +
            "            display: flex;\n" +
            "            justify-content: space-between;\n" +
            "            padding: 20px;\n" +
            "        }\n" +
            "        .profile {\n" +
            "            width: 70%;\n" +
            "            background-color: #fff;\n" +
            "            padding: 20px;\n" +
            "            border-radius: 5px;\n" +
            "            box-shadow: 0 0 5px rgba(0,0,0,0.1);\n" +
            "            margin-right: 40px; /* 添加间距 */\n" +
            "        }\n" +
            "        .profile h2 {\n" +
            "            margin: 0 0 10px 0;\n" +
            "            font-size: 20px;\n" +
            "        }\n" +
            "        .profile p {\n" +
            "            margin: 5px 0;\n" +
            "        }\n" +
            "        .sidebar {\n" +
            "            width: 25%;\n" +
            "            background-color: #fff;\n" +
            "            padding: 20px;\n" +
            "            border-radius: 5px;\n" +
            "            box-shadow: 0 0 5px rgba(0,0,0,0.1);\n" +
            "        }\n" +
            "        .sidebar h3 {\n" +
            "            margin: 0 0 10px 0;\n" +
            "            font-size: 18px;\n" +
            "        }\n" +
            "        .sidebar p {\n" +
            "            margin: 5px 0;\n" +
            "        }\n" +
            "        .edit-button {\n" +
            "            display: block;\n" +
            "            width: 100%;\n" +
            "            padding: 10px;\n" +
            "            background-color: #007BFF;\n" +
            "            color: white;\n" +
            "            text-align: center;\n" +
            "            text-decoration: none;\n" +
            "            border-radius: 5px;\n" +
            "            margin-top: 20px;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div class=\"header\">\n" +
            "    <img src=\"https://img.picui.cn/free/2024/10/19/6713cb42a9def.jpeg\" alt=\"用户头像\">\n" +
            "    <h1 id=\"username\" style=\"color: white;\">用户名</h1>\n" +
            "</div>\n" +
            "<div class=\"nav\">\n" +
            "    <a href=\"#\">主页</a>\n" +
            "    <a href=\"#\">动态</a>\n" +
            "</div>\n" +
            "<div class=\"main-content\">\n" +
            "    <div class=\"profile\">\n" +
            "        <h2>个人信息</h2>\n" +
            "        <p>姓名：xxx</p>\n" +
            "        <p>年龄：xx</p>\n" +
            "    </div>\n" +
            "    <div class=\"sidebar\">\n" +
            "        <h3>用户信息</h3>\n" +
            "        <p>用户编号：0000001</p>\n" +
            "        <p>用户类型：普通用户</p>\n" +
            "        <p>注册时间：2022-10-30</p>\n" +
            "        <a href=\"#\" class=\"edit-button\">编辑</a>\n" +
            "    </div>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>";
}
