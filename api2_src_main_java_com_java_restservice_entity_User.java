package com.java.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {

    @Id
    private String regno;
    private String branch;
    private String name;
    private String email;

    public String getregno() {
        return regno;
    }

    public void setregno(String regno) {
        this.regno = regno;
    }

    public String getbranch() {
        return branch;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "regno='" + regno + '\'' + ", branch='" + branch + '\'' + ", name='" + name + '\''
                + ", email='" + email + '\'' + '}';
    }
}