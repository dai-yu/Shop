<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<base  href="<%=basePath%>"/>
	<meta charset="UTF-8">
	<title>忘记密码</title>
	<link rel="shortcut icon" href="favicon.ico">
	<link rel="stylesheet" href="css/reset.css">
	<link rel="stylesheet" href="css/base1.css">
	<link rel="stylesheet" href="css/login.css">
	<!-- 视图窗口，移动端特属的标签。 -->
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no" />
	<link media="screen and (min-width: 992px) and (max-width:1200px)" rel="stylesheet" href="css/base1-small.css">
	<link media="screen and (min-width: 992px) and (max-width:1200px)" rel="stylesheet" href="css/login-small.css">
	<link media="screen and (min-width: 768px) and (max-width:991px)" rel="stylesheet" href="css/base1-pad.css">
	<link media="screen and (min-width: 768px) and (max-width:991px)" rel="stylesheet" href="css/login-pad.css">
</head>
<body>
	<!-- 顶部 -->
	<header>
		<!-- 搜索和logo -->
		<div class="logoAndSearch textWarp w1190 clearfix">
			<div class="logo">
				<a href="list.jsp">澳猫网</a>
			</div>
			
		</div>
	</header>
	<!-- 中间内容 -->
	<div class="mainArea">
		<div class="mainAreaW textWarp w1190">
			<div class="mainContent boxS">
			<div class="MCup clearfix">
					<div class="MCright W310">
			<form action="user/forget" method="post">
						<h3 class="clearfix">
							<span>修改密码</span>
							<a target="_self" href="login.jsp">登录</a>
						</h3>
						<p class="userName">
							<em></em>
							<input class="W310" name="username" placeholder="请输入您的用户名" type="text">
						</p>
						<p class="userName">
							<em></em>
							<input class="W310" name="question" placeholder="请输入您的安全问题" type="text">
						</p>
						<p class="userName">
							<em></em>
							<input class="W310" name="answer" placeholder="请输入您答案" type="text">
						</p>
						<input class="loGin W310" type="submit" value="确认">
						</form>
					</div>
					
				</div>
				</div>
		</div>
	</div>
	<!-- 底部 -->
	<footer>
		<div class="txt textWarp w1190">       
			<ul>
				<li><a href="#">关于澳猫海淘</a></li>
				<li><a href="#">商家入驻</a></li>
				<li><a href="#">网站合作</a></li>
				<li><a href="#">友情链接</a></li>
				<li><a href="#">澳猫公益</a></li>
				<li><a href="#">法律声明</a></li>
				<li><a href="#">诚聘英才</a></li>
				<li><a href="#">联系我们</a></li>
				<li><a href="#">网站地图</a></li>
			</ul>
			<p>
				澳大利亚Health more - 河南康多多贸易有限公司 - 河南澳蜜电子商务有限公司 版权所有<br>
				Copyright © 20015-2018  澳猫aumalls.com 版权所有, 豫ICP备15030837号-1
			</p>
			<div class="ALLN"></div>
		</div>
	</footer>
	<script src="js/jquery-1.7.2.min.js"></script>
	<script src="js/jquery.lazyload.min.js"></script>
	<script src="js/login.js"></script>
</body>
</html>