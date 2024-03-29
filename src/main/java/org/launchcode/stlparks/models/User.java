package org.launchcode.stlparks.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDate;




@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters")
    private String userName;

    @NotNull
    private String hashedPassword;

    private LocalDate joinDate;

    public User(String userName, String password){
        this.userName = userName;
        this.hashedPassword = getSHA256(password);
        this.joinDate = LocalDate.now();
    }

    public User(){}

    public static String getSHA256(String input){

        String toReturn = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toReturn;
    }

    public int getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }


    public LocalDate getJoinDate() {
        return joinDate;
    }

}
