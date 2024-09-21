package edu.eci.cvds.stock.controller;

import edu.eci.cvds.stock.StockApplication;
import edu.eci.cvds.stock.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class StockController {

    @Autowired
    private StockController stockController;

    @GetMapping
    public List<Product> getAllProducts()
    {
        return stockController.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return stockController.getProductById(id);

    }



}
