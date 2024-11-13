package com.admin.product;

public class Product {
    private int productID;
    private String productName;
    private String productDescription;
    private int  productprice;
    private int productQuantity;
    private String productCategory;

    public Product() {

    }
    public Product(int productID, String productName,String productDescription,int productprice,int productQuantity,String productCategory){
        this.productID=productID;
        this.productName=productName;
        this.productDescription=productDescription;
        this.productprice=productprice;
        this.productQuantity=productQuantity;
        this.productCategory=productCategory;

    }
    @Override
    public String toString() {
        return "Product{" +
                "productId{" + productID+
                ", productName='" + productName+ '\''+
                ", productDescription='" + productDescription+ '\''+
                ", productPrice=" + productprice+
                ", productQuantity=" + productQuantity+
                ", productCategory='" + productCategory+ '\''+
                "}";
    }
}
