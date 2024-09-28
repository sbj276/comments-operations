package com.comment.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comment.management.model.CommentsDAO;
import com.comment.management.service.CommentsSearchServiceInterface;

@RestController
@RequestMapping("/api/v2/")
public class CommentsSearchController {

	@Autowired
	private CommentsSearchServiceInterface commentsSearch;
	
	@GetMapping("comments")
	public ResponseEntity<List<CommentsDAO>> getAllComments(){
		
		return new ResponseEntity<>(
				commentsSearch.getAllComments(),
				HttpStatus.OK);
		
	}
	
}
