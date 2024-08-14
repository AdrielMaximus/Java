package com.project.cache.resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import com.project.cache.service.ProductService; // Add this import statement

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductResource {
    private final ProductService productService;
    
    @GetMapping("/")
    public String listAll() {

        return productService.listAll();
    }
    
}
