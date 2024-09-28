package com.comment.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.management.model.CommentsDAO;
import com.comment.management.repo.CommentsSearchRepository;

@Service
public class CommentsSearchService implements CommentsSearchServiceInterface{

	@Autowired
	private CommentsSearchRepository commentsSearchRepo;
	
	@Override
	public List<CommentsDAO> getAllComments() {
		// TODO Auto-generated method stub
		
		List<CommentsDAO> allComments = new ArrayList<>();
		
		commentsSearchRepo.findAll().stream().forEach(
				
				comment ->{
					CommentsDAO cmt = CommentsDAO.builder()
					.id(comment.getId())
					.byUser(comment.getByuser())
					.text(comment.getText())
					.dateOfComment(comment.getDateofcomment()).build();
					
					allComments.add(cmt);
				}
				
				);
		
		return allComments;
	}
	

}
