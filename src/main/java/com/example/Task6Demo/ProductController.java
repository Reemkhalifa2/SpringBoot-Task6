package com.example.Task6Demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {

    HashMap<Integer, Product> products = new HashMap<>();

    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable int id, @RequestParam int stock){
        products.put(1, new Product(1, "Laptop", 20));
        products.put(2, new Product(2, "Iphone", 45));
        products.put(3, new Product(3, "Monitor", 15));
        for(Map.Entry<Integer,Product > m : products.entrySet()){
            if(m.getValue().getId() == id){
                int prevStock = m.getValue().getStockQuantity();
                m.getValue().setStockQuantity(stock);
                return "Product name: "+m.getValue().getName() +
                        " Previous stock quantity : "+ prevStock+
                        " updated stock quantity: " +m.getValue().getStockQuantity()+
                        "Stock been updated!!";
            }

        }
        return "Product not found";

    }
}
