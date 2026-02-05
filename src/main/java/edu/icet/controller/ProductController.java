package edu.icet.controller;

import edu.icet.dto.ProductDto;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    final private ProductService service;

    @GetMapping("/product")
    public ProductDto getProduct(){
        return new ProductDto(1,"Phone",5000.0,"IPhone 14 Pro","-");
    }

    @PostMapping("/add-product")
    public Boolean addProduct(ProductDto productDto){
        return service.add(productDto);
    }
}
