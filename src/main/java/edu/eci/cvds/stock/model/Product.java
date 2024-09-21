package edu.eci.cvds.stock.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "products")
public class Product {

    private @Id @GeneratedValue int idProducto;
    private String name;
    private float price;
    private int quantity;
    private String category;

    public Product(int id, String name, float price, int quantity, String category){
        this.idProducto = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public int getIdProducto(){
        return idProducto;
    }

    public void setIdProducto(int idProducto){
        this.idProducto = idProducto;
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
