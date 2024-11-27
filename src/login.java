package com.admin.auth.Login;
public class Login {

    private final String ID="admin";
    private final String Password="123";

    public boolean authenticate(String id,String password){
        return id.equals(ID)&& password.equals(Password);

    }
}

