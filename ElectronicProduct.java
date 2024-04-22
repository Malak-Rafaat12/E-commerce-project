package com.mycompany.e.commerce_system;
public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;

    public ElectronicProduct(int productId, String name, double price, String brand, int warrntyPeriod) {
        super(productId, name, price);
        this.brand=brand;
        this.warrantyPeriod=Math.abs(warrantyPeriod);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
