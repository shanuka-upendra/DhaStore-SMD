package edu.icet.repository;

import edu.icet.dto.ProductDto;

import java.util.List;

public interface ProductRepository {
    Boolean add(ProductDto productDto);
    List<ProductDto> getAll();
    void delete(Integer id);
    void update(ProductDto productDto);
}
