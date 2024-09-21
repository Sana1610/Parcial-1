package edu.eci.cvds.stock.model;

public class Product {

    private String name;
    private float price;
    private int quantity;
    private String category;

    public Product(String name, float price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String productName){
        this.name = productName;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float productPrice){
        this.price = productPrice;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int productQuantity)
    {
        this.quantity = productQuantity;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String productCategory){
        this.category = productCategory;
    }
}
