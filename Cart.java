package com.mycompany.e.commerce_system;
public class Cart {
   private int customerId;
   private int nProducts;
   private Product[] products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products=new Product[nProducts];
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }
    public void addProduct(Product product, int i){
        if(i>=0 && i< nProducts){
            products[i]=product;
        } else{
        System.out.println("Invalid index");
        }
    }
    public void removeProduct(int i){
        if(i>=0 && i<nProducts){
            products[i]=null;
        } else{
            System.out.println("Invalid index");
        }
    }
    public double calculatePrice(){
        double totalPrice =0;
        for(Product product: products){
            if (product != null) {
                totalPrice+= product.getPrice();
            }
        }
        return totalPrice;
    }
    public void placeOrder(){
        Order order= new Order(customerId,1,products,calculatePrice());
        order.printOrderInfo();
    }  
}
