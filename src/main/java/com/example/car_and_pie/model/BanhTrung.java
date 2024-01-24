package com.example.car_and_pie.model;

public class BanhTrung {
    private int id;
    private String details;
    private String type;
    private int price;
    private boolean status;

    public BanhTrung() {
    }

    public BanhTrung(int id, String details, String type, int price, boolean status) {
        this.id = id;
        this.details = details;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
