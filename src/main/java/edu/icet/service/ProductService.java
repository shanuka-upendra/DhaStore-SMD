package edu.icet.service;

import edu.icet.dto.ProductDto;
import java.util.List;

public interface ProductService {
    Boolean add(ProductDto productDto);
    List<ProductDto> getAll();
}
