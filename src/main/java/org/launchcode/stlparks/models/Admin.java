package org.launchcode.stlparks.models;

public class Admin {

    private String userName;
    private String password;

    //constructors
    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Admin(){}


    //getters & setters


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
