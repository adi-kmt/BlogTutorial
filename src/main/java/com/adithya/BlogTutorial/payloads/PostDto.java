package com.adithya.BlogTutorial.payloads;

import com.adithya.BlogTutorial.entities.Category;
import com.adithya.BlogTutorial.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private Integer postId;

    private String title;

    private String content;

    private String imageName;

    private Date addedDate;

    private Category category;

    private User user;
}
