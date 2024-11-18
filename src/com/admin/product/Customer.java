package com.admin.product;

public class Customer {
    private int id;
    private String name;
    private String email;
    private int phonenumber;
    //constructor
    public Customer(int id,String name,String email,int phonenumber){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phonenumber=phonenumber;
    }
    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}

