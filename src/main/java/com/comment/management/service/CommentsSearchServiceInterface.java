package com.comment.management.service;

import java.util.List;

import com.comment.management.model.CommentsDAO;

public interface CommentsSearchServiceInterface {

	public List<CommentsDAO> getAllComments();
}
