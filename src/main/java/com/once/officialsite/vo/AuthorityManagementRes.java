package com.once.officialsite.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.once.officialsite.entity.AuthorityGroupEdit;
import com.once.officialsite.entity.AuthorityGroupList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorityManagementRes {
	
	//権限グループリスト
	private AuthorityGroupList authorityGroupList;
	
	private AuthorityGroupEdit authorityGroupEdit;
	
	//メッセージ一
	private String message;
	
	//====Rth Code====
	
	public AuthorityManagementRes (String message) {
		this.message = message;
	}
	
	//================
	

	public AuthorityManagementRes() {
		
	}

	public AuthorityManagementRes(AuthorityGroupList authorityGroupList, AuthorityGroupEdit authorityGroupEdit,
			String message) {
		
		this.authorityGroupList = authorityGroupList;
		this.authorityGroupEdit = authorityGroupEdit;
		this.message = message;
	}

	public AuthorityGroupList getAuthorityGroupList() {
		return authorityGroupList;
	}

	public void setAuthorityGroupList(AuthorityGroupList authorityGroupList) {
		this.authorityGroupList = authorityGroupList;
	}

	public AuthorityGroupEdit getAuthorityGroupEdit() {
		return authorityGroupEdit;
	}

	public void setAuthorityGroupEdit(AuthorityGroupEdit authorityGroupEdit) {
		this.authorityGroupEdit = authorityGroupEdit;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
