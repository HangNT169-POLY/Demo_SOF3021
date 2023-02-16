<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="/sinh-vien/update" method="POST">
    <input name="ma" value="${sinhVien.ma }"> <br>
    <label>Tên: </label>
    <input name="ten"
           value="${sinhVien.ten }"> <br>
    <label>Tuổi: </label>
    <input name="tuoi" value="${sinhVien.tuoi }"> <br>
    <button type="submit">update</button>
</form>

</body>
</html>