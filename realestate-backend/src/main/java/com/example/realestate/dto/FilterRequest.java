package com.example.realestate.dto;

import com.example.realestate.entity.Property;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FilterRequest {
    private Property.PropertyType type;
    private Property.PropertyStatus status;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
}
