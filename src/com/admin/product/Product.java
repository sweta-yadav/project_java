package com.admin.product;

public class Product {
    private int productID;
    private String productName;
    private double productprice;
    private int productQuantity;
    private String productCategory;
    private String BrandName;
    private String ShippingInformation;
    private String StockStatus;

    public Product() { }

    public Product(int productID, String productName, double productprice, int productQuantity, String productCategory, String brandName, String shippingInformation, String stockStatus) {
        this.productID = productID;
        this.productName = productName;
        this.productprice = productprice;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
        BrandName = brandName;
        ShippingInformation = shippingInformation;
        StockStatus = stockStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productprice=" + productprice +
                ", productQuantity=" + productQuantity +
                ", productCategory='" + productCategory + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", ShippingInformation='" + ShippingInformation + '\'' +
                ", StockStatus='" + StockStatus + '\'' +
                '}';
    }
}


