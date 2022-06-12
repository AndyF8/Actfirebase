package com.example.actfirebase.model;

public class user {
    private String id, name, email;

    public user(){

    }

    public user(String name, String email){
        this.name = name;
        this.email = email;

    }

    public String getId(){
        return id;

    }

    public void setId(String id) {
        this.id = id;

    }

    public String getName() {
        return name;

    }

    public String getEmail() {
        return email;

    }

    public  void setEmail(String Email){
        this.email = email;

    }
}
