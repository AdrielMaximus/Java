package com.project.cache.resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import com.project.cache.service.ProductService; // Add this import statement

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Slf4j
public class ProductResource {
    private final ProductService productService;
    
    @GetMapping("/")
    public String listAll() {
        log.info("Request to list all products");
        return productService.listAll();
    }
    
}
