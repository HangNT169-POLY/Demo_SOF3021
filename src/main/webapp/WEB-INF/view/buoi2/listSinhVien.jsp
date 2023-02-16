<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<table>
    <form action="/sinh-vien/search" method="GET">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/sinh-vien/view-add">Add Student</a></button>
    <tr>
        <th>ID</th>
        <th>Fullname</th>
        <th>Username</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sinhViens}" var="acc">
        <tr>
            <td>${acc.ma}</td>
            <td>${acc.ten}</td>
            <td>${acc.tuoi}</td>o
            <td>
                <button><a href="/sinh-vien/detail/${acc.ma}"
                           class="btn btn-danger"> detail </a></button>
                <button><a href="/sinh-vien/delete/${acc.ma}"
                           class="btn btn-danger"> delete </a></button>
                <button><a href="/sinh-vien/view-update/${acc.ma}"
                           class="btn btn-danger"> update </a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>