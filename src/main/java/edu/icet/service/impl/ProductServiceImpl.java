package edu.icet.service.impl;

import edu.icet.dto.ProductDto;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    final private ProductRepository repository;

    @Override
    public Boolean add(ProductDto productDto) {
        return repository.add(productDto);
    }

    @Override
    public List<ProductDto> getAll() {
        return List.of();
    }
}
