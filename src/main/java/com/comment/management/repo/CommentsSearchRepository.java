package com.comment.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comment.management.entity.Comments;

@Repository
public interface CommentsSearchRepository extends JpaRepository<Comments, Integer>{

}
