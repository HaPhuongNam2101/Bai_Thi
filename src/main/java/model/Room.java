package model;

import java.time.LocalDate;

public class Room {
    private int id;
    private String roomCode;
    private String tenantName;
    private String phoneNumber;
    private String startDate;
    private int paymentTypeId;
    private String note;


    public Room() {
    }

    // Constructor có tham số
    public Room(int id, String roomCode, String tenantName, String phoneNumber, String startDate, int paymentTypeId, String note) {
        this.id = id;
        this.roomCode = roomCode;
        this.tenantName = tenantName;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.paymentTypeId = paymentTypeId;
        this.note = note;
    }

    public Room(int roomId, String roomCode, String tenantName, String phoneNumber, LocalDate startDate, int paymentTypeId, String note) {
    }


    public Room(String roomCode, String tenantName, String phoneNumber, String startDate, int paymentTypeId, String note) {
    }

    // Getter và Setter cho từng thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
