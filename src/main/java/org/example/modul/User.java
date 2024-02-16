package org.example.modul;

public class User {
    private String phoneNumber;
    private double longitude;
    private double latitude;
    private long chatId;
    private BotState state;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public BotState getState() {
        return state;
    }

    public void setState(BotState state) {
        this.state = state;
    }

    public User(String phoneNumber, double longitude, double latitude, long chatId, BotState state) {
        this.phoneNumber = phoneNumber;
        this.longitude = longitude;
        this.latitude = latitude;
        this.chatId = chatId;
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", chatId=" + chatId +
                ", state=" + state +
                '}';
    }

    public User(long chatId, String phoneNumber, BotState state) {
    }
}
