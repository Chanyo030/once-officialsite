package com.once.officialsite.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.once.officialsite.service.ifs.AuthorityManagementService;
import com.once.officialsite.vo.AuthorityManagementReq;
import com.once.officialsite.vo.AuthorityManagementRes;

@CrossOrigin
@RestController
public class AuthorityManagementController {
	
	@Autowired
	private AuthorityManagementService authorityManagementService;
	
	//@PostMapping用來處理post類型的http请求
	@PostMapping(value="api/addAuthorityGroupEdit")
	
	// @RequestBody用來標記資料存取層(介面層interface) req是用來接收外部資料並放入api裡使用
	public AuthorityManagementRes addAuthorityGroupEdit(@RequestBody AuthorityManagementReq authorityManagementReq) {
		AuthorityManagementRes authorityManagementRes = new AuthorityManagementRes();
		authorityManagementRes = authorityManagementService.addAuthorityGroupEdit(
				authorityManagementReq.getAuthorityGroupEditID(), 
				authorityManagementReq.getCreateDate(), 
				authorityManagementReq.getGroupName(), 
				authorityManagementReq.getGroupID(), 
				authorityManagementReq.getComment());
		return authorityManagementRes;
		
	}
	
	@PostMapping(value="api/updateAuthorityGroupEdit")
	public AuthorityManagementRes updateAuthorityGroupEdit(@RequestBody AuthorityManagementReq authorityManagementReq) {
		AuthorityManagementRes authorityManagementRes = new AuthorityManagementRes();
		authorityManagementRes = authorityManagementService.updateAuthorityGroupEdit(
				authorityManagementReq.getAuthorityGroupEditID(), 
				authorityManagementReq.getCreateDate(), 
				authorityManagementReq.getGroupName(), 
				authorityManagementReq.getGroupID(), 
				authorityManagementReq.getComment());
		return authorityManagementRes;
		
	}
	
}
