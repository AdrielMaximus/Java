package com.project.cache.repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
@Repository
@Slf4j
public class ProductRepository {
    public String listAll() {
        log.info("Request to list all products");
        return "List of products";
    }
}
