package com.project.cache.repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@Slf4j
public class ProductRepository {
    public List<Products> listAll() {
        log.info("Request to list all products");
        final Product product1 = Product.builder()
            .sku("sku1")
            .price(new BigDecimal("100.00"))
            .description("Product 1")
            .build();
        List<Products> products = List.of();
        final Product product2 = Product.builder()
            .sku("sku2")
            .price(new BigDecimal("200.00"))
            .description("Product 2")
            .build();
        final Product product3 = Product.builder()
            .sku("sku3")
            .price(new BigDecimal("300.00"))
            .description("Product 3")
            .build();
        List<Products> products = List.of(product1, product2, product3);
        return products;
    }
}
