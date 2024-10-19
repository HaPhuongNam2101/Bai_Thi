<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="../Css/roomList.css" type="text/css" rel="stylesheet">
    <title>Danh sách phòng trọ</title>

</head>
<body>
<h2>Danh sách phòng trọ</h2>
<form action="search" method="get">
    <input type="text" name="query" placeholder="Tìm kiếm...">
    <button type="submit">Tìm kiếm</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th>STT</th>
        <th>Mã phòng trọ</th>
        <th>Tên người thuê</th>
        <th>Số điện thoại</th>
        <th>Ngày bắt đầu thuê</th>
        <th>Hình thức thanh toán</th>
        <th>Ghi chú</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${roomList}">
        <tr>
            <td>${item.id}</td>
            <td>${item.roomId}</td>
            <td>${item.tenantName}</td>
            <td>${item.phoneNumber}</td>
            <td>${item.startDate}</td>
            <td>
                <c:choose>
                    <c:when test="${item.paymentType == 1}">Theo tháng</c:when>
                    <c:when test="${item.paymentType == 2}">Theo quý</c:when>
                    <c:when test="${item.paymentType == 3}">Theo năm</c:when>
                    <c:otherwise>Không xác định</c:otherwise>
                </c:choose>
            </td>
            <td>${item.note}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="createRoom.jsp" class="btn btn-primary">Tạo phòng trọ mới</a>
</body>
</html>
