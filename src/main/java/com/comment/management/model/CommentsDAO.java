package com.comment.management.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDAO {

	private int id;
	private String byUser;
	private String text;
	private Date dateOfComment;
		
}
