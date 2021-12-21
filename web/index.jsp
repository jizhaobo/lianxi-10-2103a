<%--
  Created by IntelliJ IDEA.
  User: JZB
  Date: 2021/11/11
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>$Title$</title>

  </head>
  <body>
  未注册的用户，请
  <a href="${pageContext.request.contextPath}/user/register">注册</a><br/>
  <a href="${pageContext.request.contextPath}/user/login">登录</a>
 </body>
</html>
