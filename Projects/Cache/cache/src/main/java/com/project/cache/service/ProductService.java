package com.project.cache.service;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.project.cache.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    public List<Product> listAll() {
        log.info("Request to list all products");
        return "List of products";
    }
}
