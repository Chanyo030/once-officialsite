package com.once.officialsite.vo;

import java.time.LocalDateTime;

public class AuthorityManagementReq {
	
	//K2024 AuthorityGroupList
	
	//権限グループNo
	private int authorityGroupNo;
	
	//権限グループ名称	
	private String authorityGroupName;
	
	//権限グループID
	private String authorityGroupID;
	
	//削除フラグ
	private boolean authorityGroupDelet;
	
	
	//K2025 AuthorityGroupEdit
	
	private int authorityGroupEditID;
	
	//作成年月日
	private LocalDateTime createDate;
	
	//グループ名称
	private String groupName;
	
	//グループID
	private String groupID;
	
	//コメント
	private String comment;

	public AuthorityManagementReq() {
		
	}


	public AuthorityManagementReq(int authorityGroupNo, String authorityGroupName, String authorityGroupID,
			boolean authorityGroupDelet, int authorityGroupEditID, LocalDateTime createDate, String groupName,
			String groupID, String comment) {
		
		this.authorityGroupNo = authorityGroupNo;
		this.authorityGroupName = authorityGroupName;
		this.authorityGroupID = authorityGroupID;
		this.authorityGroupDelet = authorityGroupDelet;
		this.authorityGroupEditID = authorityGroupEditID;
		this.createDate = createDate;
		this.groupName = groupName;
		this.groupID = groupID;
		this.comment = comment;
	}



	public int getAuthorityGroupNo() {
		return authorityGroupNo;
	}

	public void setAuthorityGroupNo(int authorityGroupNo) {
		this.authorityGroupNo = authorityGroupNo;
	}

	public String getAuthorityGroupName() {
		return authorityGroupName;
	}

	public void setAuthorityGroupName(String authorityGroupName) {
		this.authorityGroupName = authorityGroupName;
	}

	public String getAuthorityGroupID() {
		return authorityGroupID;
	}

	public void setAuthorityGroupID(String authorityGroupID) {
		this.authorityGroupID = authorityGroupID;
	}

	public boolean isAuthorityGroupDelet() {
		return authorityGroupDelet;
	}

	public void setAuthorityGroupDelet(boolean authorityGroupDelet) {
		this.authorityGroupDelet = authorityGroupDelet;
	}


	public int getAuthorityGroupEditID() {
		return authorityGroupEditID;
	}


	public void setAuthorityGroupEditID(int authorityGroupEditID) {
		this.authorityGroupEditID = authorityGroupEditID;
	}


	public LocalDateTime getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public String getGroupID() {
		return groupID;
	}


	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
