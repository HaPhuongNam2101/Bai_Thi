
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link href="../Css/deleteConfirmation.css" type="text/css" rel="stylesheet">
        <title>Document</title>
    </head>
    <body>
    <div class="container">
        <h1>Xác nhận xóa phòng</h1>
        <p>Bạn có chắc chắn muốn xóa phòng với mã phòng <strong>${room.roomCode}</strong> không?</p>
        <form action="rooms" method="post">
            <input type="hidden" name="action" value="delete">
            <input type="hidden" name="id" value="${room.id}">
            <button type="submit">Có, xóa</button>
        </form>
        <a href="index.jsp">Không, trở về</a>
    </div>
    </body>
    </html>
