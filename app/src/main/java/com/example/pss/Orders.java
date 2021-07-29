package com.example.pss;

public class Orders {
    private String name;
    private String address;
    private String dueDate;
    private String lastModified;
    private String createdOn;


    public Orders(String name, String address, String dueDate, String lastModified, String createdOn) {
        this.name = name;
        this.address = address;
        this.dueDate = dueDate;
        this.lastModified = lastModified;
        this.createdOn = createdOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
}
