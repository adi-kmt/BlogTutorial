package com.adithya.BlogTutorial.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Integer categoryId;

    @NotEmpty
    @Size(min = 4, message = "Minimum size of 4 required")
    private String categoryTitle;

    @NotEmpty
    @Size(min= 10, message = "Minimum size of 10 required")
    private String categoryDescription;
}
