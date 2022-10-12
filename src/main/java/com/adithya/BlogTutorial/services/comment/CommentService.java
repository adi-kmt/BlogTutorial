package com.adithya.BlogTutorial.services.comment;

import com.adithya.BlogTutorial.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);

}
