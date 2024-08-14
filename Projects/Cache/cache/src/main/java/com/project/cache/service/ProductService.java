package com.project.cache.service;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.project.cache.repository.ProductRepository;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public String listAll() {

        return "List of products";
    }
}
