package com.demo.kimbang.dropdatatoview;



public class Users {
    private String fulName;
    private String address;
    private String birthDate;
    private String phoneNumber;
    private int avatar;

    public Users(String fulName, String address, String birthDate, String phoneNumber, int avatar) {
        this.fulName = fulName;
        this.address = address;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
    }

    public String getFulName() {
        return fulName;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
