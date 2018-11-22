package com.yangshijie.transportation.dbentity;


/**
 * 用户实体类
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String plate;
    private String balance;

    public User( String username, String password, String name, String plate, String balance) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.plate = plate;
        this.balance = balance;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", plate='" + plate + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
