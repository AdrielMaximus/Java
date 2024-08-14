package com.project.cache.repository;
import org.springframework.stereotype.Repository;
@Repository
public class ProductRepository {
    public String listAll() {

        return "List of products";
    }
}
