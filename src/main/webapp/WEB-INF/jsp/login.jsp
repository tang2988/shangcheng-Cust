<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!DOCTYPE html>
<!-- saved from url=(0094)http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/demo.html -->
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>商城-用户登录</title>
    <link rel="stylesheet" href="/base.css">
    <link rel="stylesheet" href="/login.css">


</head>
<body>
<div id="main">
    <div id="header">
    </div>
    <div class="container">
        <div class="bgPic"><img src="/b3_1.jpg" alt=""></div>
        <div class="register">
            <div class="title">
                <span>登录</span>
                <a href="http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/register.html">去注册</a>
            </div>
            <form autocomplete="on">
                <div class="default">
                    <p>请输入用户名或手机号码</p>
                    <input id="uname" name="uname" data-form="uname" type="text" placeholder="用户名" >
                   <!-- <label for="uname">用户名/手机</label>-->
                </div>
                <div class="default">
                    <p>请输入账号密码</p>
                    <input id="upwd" name="upwd" data-form="upwd" type="password" placeholder="密码">
                    <!-- <label for="upwd">密码</label>-->
                </div>
                <div class="submit">
                        <span class="notice">
                            <a href="http://www.17sucai.com/preview/66735/2018-04-23/%E6%9E%81%E5%AE%A2%E5%95%86%E5%9F%8E/demo.html#">忘记密码</a>
                        </span>
                    <button class="s_hover" data-form="submit">登录</button>
                </div>
            </form>s
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