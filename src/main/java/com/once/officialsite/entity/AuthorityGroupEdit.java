package com.once.officialsite.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authoritygroupedit")
public class AuthorityGroupEdit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Authority_Group_Edit_ID")
	private int authorityGroupEditID;
	
	//作成年月日
	@Column(name = "Create_Date")
	private LocalDateTime createDate;
	
	//グループ名称
	@Column(name = "Group_Name")
	private String groupName;
	
	//グループID
	@Column(name = "Group_ID")
	private String groupID;
	
	//コメント
	@Column(name = "Comment")
	private String comment;

	public AuthorityGroupEdit() {
		
	}

	public AuthorityGroupEdit(int authorityGroupEditID, LocalDateTime createDate, String groupName, String groupID,
			String comment) {
		
		this.authorityGroupEditID = authorityGroupEditID;
		this.createDate = createDate;
		this.groupName = groupName;
		this.groupID = groupID;
		this.comment = comment;
	}
	
	public void updateAuthorityGroupEdit(LocalDateTime createDate, String groupName, String comment) {
		this.createDate = createDate;
		this.groupName = groupName;
		this.comment = comment;
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
