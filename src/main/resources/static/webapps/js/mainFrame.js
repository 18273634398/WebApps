new Vue({
    el: '#image-section',
    data: {
        imgArr: [
            "../source/picture/CPC_ChuXin.png",
            "../source/picture/CPC_Chuxin2.png"
        ],
        index: 0
    },
    mounted: function getBlogTop() {
        var url = "http://localhost:8080/api/blog-get-top";
        console.log(url);
        $.ajax({
            url: url,
            type: "get",
            success: function (result) {    // 如果响应成功了(有响应)，则执行此回调函数  result 表示后端返回的结果
                const blogSection = document.querySelector('.blog-section');
                blogSection.innerHTML = ''; // 清空现有内容
                result.forEach(data => {
                    const article = document.createElement('article');
                    article.innerHTML = `
                            <h2>${data.title}</h2>
                            <p>${data.summary}</p>
                        `;
                    // 为每个article添加点击事件
                    article.addEventListener('click', function() {
                        console.log('Article clicked:', data);
                        window.location.href = '/api/blog_' + data.id;
                    });
                    blogSection.appendChild(article);


                });
            }
        });
    },
    methods: {
        sub: function () {
            if (this.index > 0) {
                this.index--;
            } else {
                this.index = this.imgArr.length - 1;
            }
        },
        add: function () {
            if (this.index < this.imgArr.length - 1) {
                this.index++;
            } else {
                this.index = 0;
            }
        }
    }
})

// 侧边栏切换函数
function toggleNav() {
    var sidebarWidth = 280;
    var sidebar = document.getElementById("sidebar");
    if (sidebar.style.width === (sidebarWidth + "px")) {
        sidebar.style.width = "0";
    } else {
        sidebar.style.width = sidebarWidth + "px";
    }
}

// 获取元素并添加点击事件
var menuIcon = document.getElementById("menu-icon");
menuIcon.onclick = function () {
    toggleNav();
};