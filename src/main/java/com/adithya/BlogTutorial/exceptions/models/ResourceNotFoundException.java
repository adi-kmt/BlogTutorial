package com.adithya.BlogTutorial.exceptions.models;

import lombok.Data;

@Data
public class ResourceNotFoundException extends RuntimeException{

    String resourceName;
    String fieldName;
    Integer fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Integer fieldValue){
        super(String.format("%s not found with %s: %d",resourceName, fieldName, fieldValue));
        this.fieldName= fieldName;
        this.fieldValue = fieldValue;
        this.resourceName = resourceName;
    }
}
