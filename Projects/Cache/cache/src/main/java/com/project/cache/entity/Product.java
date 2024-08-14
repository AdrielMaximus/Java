package com.project.cache.entity;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class Product {
    private String sku;
    private BigDecimal price;
    private String description;
    private boolean available;
    
}
