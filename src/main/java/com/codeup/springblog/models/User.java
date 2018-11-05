package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 23)
    private String username;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(length = 60)
    private String picture_large;


    public User() {
    }

    public User(String username, String email, String password, String picture_large) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.picture_large = picture_large;
    }

    public User(long id, String username, String email, String password, String picture_large) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.picture_large = picture_large;
    }
    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
        picture_large = copy.picture_large;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture_large() {
        return picture_large;
    }

    public void setPicture_large(String picture_large) {
        this.picture_large = picture_large;
    }
}
