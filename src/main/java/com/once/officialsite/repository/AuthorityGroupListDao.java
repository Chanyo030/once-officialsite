package com.once.officialsite.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.once.officialsite.entity.AuthorityGroupList;

@Transactional
@Repository
public interface AuthorityGroupListDao extends JpaRepository<AuthorityGroupList, Integer>{

}
