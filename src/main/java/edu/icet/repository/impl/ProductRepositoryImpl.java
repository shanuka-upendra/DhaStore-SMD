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
        String sql = "SELECT * FROM product";
        return template.query(sql,(rs, rowNum) ->new ProductDto(
                rs.getInt(1),
                rs.getString(2),
                rs.getDouble(3),
                rs.getString(4),
                rs.getString(5)
        ));
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM product WHERE id = ?";
        template.update(sql,id);
    }
}
