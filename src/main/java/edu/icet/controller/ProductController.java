package edu.icet.controller;

import edu.icet.dto.ProductDto;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/search-all")
    public List<ProductDto> searchAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete")
    public void deleteProduct(Integer id){
        service.delete(id);
    }
}
