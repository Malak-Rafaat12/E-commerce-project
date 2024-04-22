package com.mycompany.e.commerce_system;
import javax.swing.JOptionPane;
public class ECommerce_System {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to the E-commerce System!");
        int customerId = Integer.parseInt(JOptionPane.showInputDialog("please enter your ID"));
        String customerName= JOptionPane.showInputDialog("please enter your name");
        String customeraddress= JOptionPane.showInputDialog("please enter your address");
        ElectronicProduct smartPhone = new ElectronicProduct(1,"smartPhone",599.99,"samsung",1);
        ClothingProduct t_shirt = new ClothingProduct(2,"T-shirt",19.99, "medium","cotton");
        BookProduct oop= new BookProduct(3,"oop",39.99,"0'Reilly","x publications");
        Customer c = new Customer(customerId, customerName,customeraddress);
        int nProducts= Integer.parseInt(JOptionPane.showInputDialog("How many products do you want to add to your cart?"));
        Cart cart=new Cart(c.getCustomerId(), nProducts);
    for (int i=0; i< nProducts; i++){
        int choice= Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add? 1-smartphone 2- T-shirt 3-oop"));
        switch (choice) {
            case 1:
                cart.addProduct(smartPhone, i);
                break;
            case 2:
                cart.addProduct(t_shirt, i);
                break;
            case 3:
                cart.addProduct(oop, i);
                break;
            default:
            JOptionPane.showMessageDialog(null,"Invalid choice");
            i--;
        }
    }
        double  totalPrice =cart.calculatePrice();
        int placeOrderChoice =Integer.parseInt(JOptionPane.showInputDialog(null,"your total is $"+ totalPrice+". would you like to place the order?1-Yes 2-No"));
        if(placeOrderChoice==1){
            cart.placeOrder();
        }else{
            JOptionPane.showMessageDialog(null,"order not placed");
        }
    }
}
