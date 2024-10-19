
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="../Css/roomFrom.css" type="text/css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
<h2>Tạo thông tin thuê trọ</h2>
<form action="room" method="post">
    <div class="form-group">
        <label>Mã phòng trọ</label>
        <input type="text" name="roomId" class="form-control" required>
    </div>
    <div class="form-group">
        <label>Tên người thuê</label>
        <input type="text" name="tenantName" class="form-control" required>
    </div>
    <div class="form-group">
        <label>Số điện thoại</label>
        <input type="text" name="phoneNumber" class="form-control" required>
    </div>
    <div class="form-group">
        <label>Ngày bắt đầu thuê</label>
        <input type="date" name="startDate" class="form-control" required>
    </div>
    <div class="form-group">
        <label>Hình thức thanh toán</label>
        <select name="paymentType" class="form-control" required>
            <option value="1">Theo tháng</option>
            <option value="2">Theo quý</option>
            <option value="3">Theo năm</option>
        </select>
    </div>
    <div class="form-group">
        <label>Ghi chú</label>
        <textarea name="note" class="form-control"></textarea>
    </div>
    <button type="submit" class="btn btn-success">Tạo mới</button>
    <a href="roomList.jsp" class="btn btn-secondary">Hủy</a>
</form>
</body>
</html>

