package com.krishna.app.rest.Models;

import jakarta.persistence.*;

@Entity
public class LoginUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id ;
    @Column
    private String username;
    @Column
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
