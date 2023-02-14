package com.once.officialsite.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.once.officialsite.entity.AuthorityGroupEdit;

@Transactional
@Repository
public interface AuthorityGroupEditDao extends JpaRepository<AuthorityGroupEdit, Integer>{
	
	public Optional<AuthorityGroupEdit> findByGroupName (String groupName);
	
	public Optional<AuthorityGroupEdit> findByGroupID (String groupID);
	
	

}
