package edu.icet.controller;

import edu.icet.model.Product;

public class ProductController {

    public Product getProduct(){
        return new Product("Phone",5000.0,"IPhone 14 Pro","-");
    }
}
