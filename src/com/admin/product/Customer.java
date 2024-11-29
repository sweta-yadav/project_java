package com.admin.product;
public class Customer {
    private int id;
    private String name;
    private String email;
    private long phone;
    //constructor
    public Customer(int id,String name,String email,long phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public long getPhone(){
        return phone;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(long phone){
        this.phone=phone;
    }


    
    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}





