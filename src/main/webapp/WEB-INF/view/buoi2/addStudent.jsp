README.md<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<%--    <form action="/sinh-vien/add" method="POST">--%>
<%--        Mã: <input name="ma"/>--%>
<%--        <br/>--%>
<%--        Tên: <input name="ten"/>--%>
<%--        <br/>--%>
<%--        Tuổi: <input name="tuoi"/>--%>
<%--        <br/>--%>
<%--        <button type="submit">Add</button>--%>
<%--    </form>--%>
<form:form action="/sinh-vien/add" method="POST" modelAttribute="sv1">
    Mã: <form:input path="ma"/>
    <form:errors path="ma"  /><br>
    <br/>
    Tên: <form:input path="ten"/>
    <form:errors path="ten"  /><br>
    <br/>
    Tuổi: <form:input path="tuoi"/>
    <form:errors path="tuoi" /><br>
    <br/>
    <form:button type="submit">Add</form:button>
</form:form>
</body>
</html>