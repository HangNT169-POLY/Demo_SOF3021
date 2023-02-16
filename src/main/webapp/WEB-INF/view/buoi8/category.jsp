<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <td>ID</td>
            <td>Category Code</td>
            <td>Category Name</td>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${categorys}" var="acc">
        <tr>
            <td>${acc.id}</td>
            <td>${acc.categoryCode}</td>
            <td>${acc.categoryName}</td>
            <td>
                <button><a href="/sinh-vien/detail/${acc.id}"
                           class="btn btn-danger"> detail </a></button>
                <button><a href="/sinh-vien/delete/${acc.id}"
                           class="btn btn-danger"> delete </a></button>
                <button><a href="/sinh-vien/view-update/${acc.id}"
                           class="btn btn-danger"> update </a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>