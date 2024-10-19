package controller;

import model.Room;
import service.RoomService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RoomController", value = "/rooms")
public class RoomController extends HttpServlet {
    private RoomService roomService = new RoomService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "home":
                showHome(request, response);
                break;
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id", id);
        Room roomEdit = roomService.findRoomById(id);
        request.setAttribute("roomEdit", roomEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("room/editRoom.jsp");
        dispatcher.forward(request, response);
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        roomService.delete(id);
        response.sendRedirect("rooms/roomList.jsp");
    }

    public void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/room/createRoom.jsp");
        dispatcher.forward(request, response);
    }

    public void showHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Room> roomList = roomService.findAll();
        request.setAttribute("roomList", roomList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/room/roomList.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                addRoom(request, response);
                break;
            case "update":
                updateRoom(request, response);
                break;
        }
    }

    public void addRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roomCode = request.getParameter("room_code");
        String tenantName = request.getParameter("tenant_name");
        String phoneNumber = request.getParameter("phone_number");
        String startDate = request.getParameter("start_date");
        int paymentTypeId = Integer.parseInt(request.getParameter("payment_type_id"));
        String note = request.getParameter("note");

        Room newRoom = new Room(roomCode, tenantName, phoneNumber, startDate, paymentTypeId, note);
        roomService.add(newRoom);
        response.sendRedirect("/rooms?action=roomList");
    }

    public void updateRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String roomCode = request.getParameter("room_code");
        String tenantName = request.getParameter("tenant_name");
        String phoneNumber = request.getParameter("phone_number");
        String startDate = request.getParameter("start_date");
        int paymentTypeId = Integer.parseInt(request.getParameter("payment_type_id"));
        String note = request.getParameter("note");

        Room updatedRoom = new Room(id, roomCode, tenantName, phoneNumber, startDate, paymentTypeId, note);
        roomService.edit(updatedRoom, id);

        response.sendRedirect("/rooms?action=roomList");
    }
}
