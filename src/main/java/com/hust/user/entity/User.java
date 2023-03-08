package com.hust.user.entity;

public class User {
    private int id;
    private String name;
    private String account;
    private String pwd;

    public User() {
    }

    public User(String name, String account, String pwd) {
        this.name = name;
        this.account = account;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
