<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<!-- saved from url=(0098)http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/register.html -->
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>极客商城-用户注册</title>
    <link rel="stylesheet" href="/base.css">
    <link rel="stylesheet" href="/register.css">

</head>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
<body>
    <div id="main">
        <div id="header">
        </div>
        <div class="container">
            <div class="bgPic"><img src="/b2_1.jpg" alt=""></div>
            <div class="register">
                <div class="title">
                    <span>注册</span>
                    <a href="http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/demo.html">去登录</a>
                </div>
                <form  id="signupForm">
                    
                     <div class="default">
                        <p>请输入中国大陆手机号码</p>
                        <input id="phone" name="phone"  type="text" placeholder="手机号码">
                        
                    </div>
                    
                    <div class="default">
                        <p>密码由8~10个数字和英文字符组成</p>
                        <input id="password" name="password"  type="password" placeholder="密码">
                        
                    </div>
                   
                   
                    <div class="submit">
                        <span class="notice">点击"注册"代表您同意遵守
                            <a href="http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/register.html#">用户协议</a>
                            和
                            <a href="http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/register.html#">隐私条款</a>
                        </span>
                        <button class="s_hover" data-form="submit">注册</button>
                    </div>
                </form>
                <div class="other_login">
                    <div class="log">
                        <span>社交账号登录</span>
                    </div>
                    <div class="icon">
                        <ul>
                            <li data-log="icon" class="i_hover">
                                <img data-icon="wx" src="/wx.png" alt="">
                                <span class="prompt">微信登录</span>
                            </li>
                            <li data-log="icon" class="i_hover">
                                <img data-icon="qq" src="/qq.png" alt="">
                                <span class="prompt">QQ登录</span>
                            </li>
                            <li data-log="icon" class="i_hover">
                                <img data-icon="wb" src="/wb.png" alt="">
                                <span class="prompt">微博登录</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div id="footer">
        </div>
    </div>


</body>
</html>
<script>
$().ready(function() {
// 在键盘按下并释放及提交后验证提交表单
  $("#signupForm").validate({
    rules: {
      
      phone: {
        required: true,
        minlength: 11
      },
      password: {
        required: true,
        minlength: 8
      },
     
      email: {
        required: true,
        email: true
      },
      topic: {
        required: "#newsletter:checked",
        minlength: 2
      },
      agree: "required"
    },
    messages: {
    
      phone: {
        required: "请输入手机号码",
        minlength: "用户名必需由11位数字组成"
      },
      password: {
        required: "请输入密码",
        minlength: "密码长度不能小于 8 个字母"
      },
      confirm_password: {
        required: "请输入密码",
        minlength: "密码长度不能小于 8 个字母",
        equalTo: "两次密码输入不一致"
      },
      email: "请输入一个正确的邮箱",
      agree: "请接受我们的声明",
      topic: "请选择两个主题"
     }
    })
});


</script>
