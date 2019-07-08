<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String msg=(String)request.getSession().getAttribute("msg");
if(msg=="注册成功！"){
	out.println("<script type=\"text/javascript\"> alert(\"注册成功！\")</script>");
}else{
	out.println("<script type=\"text/javascript\"> alert(\"注册失败！\")</script>");
}
%>

</body>
</html>