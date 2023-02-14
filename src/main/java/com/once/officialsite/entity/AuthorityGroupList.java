package com.once.officialsite.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authoritygrouplist")

public class AuthorityGroupList {
	
	//権限グループNo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Authority_Group_No")
	private int authorityGroupNo;
	
	//権限グループ名称	
	@Column(name = "Authority_Group_Name")
	private String authorityGroupName;
	
	//権限グループID
	@Column(name = "Authority_Group_ID")
	private String authorityGroupID;
	
	//削除フラグ
	@Column(name ="Authority_Group_Delet")
	private boolean authorityGroupDelet;
	
	
	public AuthorityGroupList() {
		
	}


	public AuthorityGroupList(int authorityGroupNo, String authorityGroupName, String authorityGroupID,
			boolean authorityGroupDelet) {
		
		this.authorityGroupNo = authorityGroupNo;
		this.authorityGroupName = authorityGroupName;
		this.authorityGroupID = authorityGroupID;
		this.authorityGroupDelet = authorityGroupDelet;
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

}
