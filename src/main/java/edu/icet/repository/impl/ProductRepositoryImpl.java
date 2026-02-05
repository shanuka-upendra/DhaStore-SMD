package edu.icet.repository.impl;

import edu.icet.dto.ProductDto;
import edu.icet.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    final private JdbcTemplate template;

    @Override
    public Boolean add(ProductDto productDto) {
        String sql = "INSERT INTO product (name,price) VALUES (?,?)";
        return template.update(sql,productDto.getName(),productDto.getPrice())>0;
    }

    @Override
    public List<ProductDto> getAll() {
        return List.of();
    }
}
