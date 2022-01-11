<%--
  Created by IntelliJ IDEA.
  User: 11382
  Date: 2022/1/10
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>展示账户数据列表</title>
</head>
<body>
  <h1> 展示账户数据列表</h1>
<table>
    <c:forEach items="${accountList}" var="account">
    <tr>
        <th>${account.id}</th>
        <th>${account.name}</th>
        <th>${account.money}</th>
    </tr>
    </c:forEach>
</table>
</body>
</html>
