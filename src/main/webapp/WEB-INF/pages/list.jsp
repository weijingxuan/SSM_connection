<%--
  Created by IntelliJ IDEA.
  User: 机械革命
  Date: 2019/10/9
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<body>
    <h3>查询的所有的账户信息</h3>
    <%--${list}--%>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</body>
<head>
    <title>Title</title>
</head>
</html>
