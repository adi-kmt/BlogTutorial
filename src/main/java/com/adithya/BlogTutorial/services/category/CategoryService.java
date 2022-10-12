package com.adithya.BlogTutorial.services.category;

import com.adithya.BlogTutorial.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    public CategoryDto createCategory(CategoryDto categoryDto);

    public CategoryDto getCategory(Integer categoryId);

    public List<CategoryDto> getAllCategories();

    public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    public void deleteCategory(Integer categoryId);
}
