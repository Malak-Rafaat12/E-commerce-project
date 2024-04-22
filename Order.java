package com.mycompany.e.commerce_system;
import javax.swing.*;
public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private double totalPrice;

    public Order(int customerId, int orderId, Product[] products,double totalprice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = totalprice;
    }
    public void printOrderInfo(){
       JOptionPane.showMessageDialog(null,"Here's your order's summary:\n");
       JOptionPane.showMessageDialog(null,"Order ID:"+ orderId+"\n");
       JOptionPane.showMessageDialog(null,"Customer ID:"+customerId+"\n");
       JOptionPane.showMessageDialog(null,"Products:\n");
        for(Product product : products){
            if (product != null){
                JOptionPane.showMessageDialog(null,"" +product.getName()+" -$"+ product.getPrice());
            }  
        }
        JOptionPane.showMessageDialog(null,"Total price: $"+ totalPrice);
    }
}
