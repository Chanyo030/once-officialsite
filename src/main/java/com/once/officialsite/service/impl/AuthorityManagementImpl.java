package com.once.officialsite.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.once.officialsite.constants.AuthorityManagementMessageCode;
import com.once.officialsite.entity.AuthorityGroupEdit;
import com.once.officialsite.repository.AuthorityGroupEditDao;
import com.once.officialsite.repository.AuthorityGroupListDao;
import com.once.officialsite.service.ifs.AuthorityManagementService;
import com.once.officialsite.vo.AuthorityManagementRes;

@Service
public class AuthorityManagementImpl implements AuthorityManagementService {
	
	@Autowired
	private AuthorityGroupListDao authorityGroupListDao;
	
	@Autowired
	private AuthorityGroupEditDao authorityGroupEditDao;

	@Override
	public AuthorityManagementRes addAuthorityGroupEdit(int authorityGroupEditID, LocalDateTime createDate, String groupName, String groupID,
			String comment) {
		
		//入力してない場合
		if(!StringUtils.hasText(groupName) || (!StringUtils.hasText(groupID))) {
			return new AuthorityManagementRes (AuthorityManagementMessageCode.NOT_ENTER_ERROR_001.getMessage());
		}
		
		//グループ名称、グループIDを重複しないください
		Optional<AuthorityGroupEdit> authorityGroupEditGroupNameOp = authorityGroupEditDao.findByGroupName(groupName);
		Optional<AuthorityGroupEdit> authorityGroupEditGroupIDOp = authorityGroupEditDao.findByGroupID(groupID);
		
		if(authorityGroupEditGroupNameOp.isPresent() || authorityGroupEditGroupIDOp.isPresent() ) {
			return new AuthorityManagementRes (AuthorityManagementMessageCode.NOT_ENTER_ERROR_002.getMessage());
		}
		
		//英字以外の文字を入力場合
		if(!groupID.matches("[a-zA-Z]+")) {
			return new AuthorityManagementRes (AuthorityManagementMessageCode.NAME_ERROR_001.getMessage());
		}
		
		AuthorityGroupEdit authorityGroupEdit = new AuthorityGroupEdit(authorityGroupEditID,createDate, groupName, groupID, comment);
		
		authorityGroupEdit.setCreateDate(LocalDateTime.now());
		
		authorityGroupEditDao.save(authorityGroupEdit);
		
		//之後註解掉
//		return new AuthorityManagementRes (AuthorityManagementMessageCode.SUCCESSFUL.getMessage());
		
		AuthorityManagementRes authorityManagementRes = new AuthorityManagementRes();
		authorityManagementRes.setAuthorityGroupEdit(authorityGroupEdit);
		return authorityManagementRes;
		 
	}

	@Override
	public AuthorityManagementRes updateAuthorityGroupEdit(int authorityGroupEditID, LocalDateTime createDate,
			String groupName, String groupID, String comment) {
		
				//入力してない場合
				if(!StringUtils.hasText(groupName) || (!StringUtils.hasText(groupID))) {
					return new AuthorityManagementRes (AuthorityManagementMessageCode.NOT_ENTER_ERROR_001.getMessage());
				}
				
				//グループ名称を重複しないください
				Optional<AuthorityGroupEdit> authorityGroupEditGroupNameOp = authorityGroupEditDao.findByGroupName(groupName);
				
				if(authorityGroupEditGroupNameOp.isPresent()) {
					return new AuthorityManagementRes (AuthorityManagementMessageCode.NOT_ENTER_ERROR_002.getMessage());
				}
				
				//英字以外の文字を入力場合
				if(!groupID.matches("[a-zA-Z]+")) {
					return new AuthorityManagementRes (AuthorityManagementMessageCode.NAME_ERROR_001.getMessage());
				}
				
				Optional<AuthorityGroupEdit> authorityGroupEditGroupIDOp = authorityGroupEditDao.findByGroupID(groupID);
				
				if(authorityGroupEditGroupIDOp.isPresent()) {
					AuthorityGroupEdit authorityGroupEdit = authorityGroupEditGroupIDOp.get();
					authorityGroupEdit.updateAuthorityGroupEdit(createDate, groupName, comment);
					authorityGroupEdit.setCreateDate(LocalDateTime.now());
					authorityGroupEditDao.save(authorityGroupEdit);
					AuthorityManagementRes authorityManagementRes = new AuthorityManagementRes();
					authorityManagementRes.setAuthorityGroupEdit(authorityGroupEdit);
					return authorityManagementRes;
				}else {
					return null;
				}
				
				
				
//				return new AuthorityManagementRes (AuthorityManagementMessageCode.CANCEL_CODE_001.getMessage());
		
	}
	
//	@Override
	
	

}
