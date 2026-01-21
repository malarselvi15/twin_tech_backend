package com.example.Twintech;

public class ContactRequest {

    private String name;
    private String company;
    private String phone;
    private String location;
    private String message;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
