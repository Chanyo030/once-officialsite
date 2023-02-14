package com.once.officialsite.constants;

//enumerated (enum) 列舉
public enum AuthorityManagementMessageCode {

	//削除
	DELETE_CODE_001("400","このデータを削除してよろしいですか？"),
	
	//グループ名称、グループIDを入力してください。
	NOT_ENTER_ERROR_001("400","グループ名称、グループIDを入力してください。"),
	
	//グループIDを英字以外の文字を入力場合。
	NAME_ERROR_001("400","グループIDをローマ字で入力してください。"),
	
	//編集内容を破棄します。よろしいですか。
	CANCEL_CODE_001("200","編集内容を破棄します。よろしいですか。"),
	
	// 増加成功
	SUCCESSFUL("200", "増加成功"),
	
	//グループ名称、グループIDを重複をしないください
	NOT_ENTER_ERROR_002("400","グループ名称、グループIDを重複しないください。");
	
	private String code;
	
	private String message;
	
	
	private AuthorityManagementMessageCode() {
		
	}

	private AuthorityManagementMessageCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
