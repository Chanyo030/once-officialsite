package com.once.officialsite.service.ifs;

import java.time.LocalDateTime;

import com.once.officialsite.vo.AuthorityManagementRes;

public interface AuthorityManagementService {
	
//	public AuthorityManagementRes deleteAuthorityGrouplist (int authorityManagementID, 
//			int authorityGroupNo, String authorityGroupName, String authorityGroupID, 
//			boolean authorityGroupDelet);
	
	public AuthorityManagementRes addAuthorityGroupEdit (int authorityGroupEditID, LocalDateTime createDate, String groupName, 
			String groupID, String comment);
	
	public AuthorityManagementRes updateAuthorityGroupEdit (int authorityGroupEditID, LocalDateTime createDate, String groupName, 
			String groupID, String comment);

}
