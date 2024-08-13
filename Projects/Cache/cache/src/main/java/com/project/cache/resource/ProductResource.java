package com.project.cache.resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/products")
public class ProductResource {
    @GetMapping("/")
    public String listAll() {

        return "List of products";
    }
    
}
