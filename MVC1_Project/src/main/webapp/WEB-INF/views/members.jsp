
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href = "/index.html">메인</a>
<table>
    <thread>
        <th>id</th>
        <th>username</th>
        <th>age</th>
    </thread>
    <tbody>
    <c:forEach var = "item" items = "${members}">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>ㅁ
