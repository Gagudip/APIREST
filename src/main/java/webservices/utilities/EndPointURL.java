package webservices.utilities;

public enum EndPointURL {

	LIST_USERS_BY_Page("/users?page="),

	GET_USER_BY_ID("/api/users/"),

	PUT_USER("/users/"),

	POST_USER("/users"),

	DELETE_USER("/users/");

	String ResourcePath;

	EndPointURL(String ResourcePath) {

		this.ResourcePath = ResourcePath;

	}
	
	public String getResourcePath() {
		
		return this.ResourcePath;
	}
	
	public String getResourcePath(String data) {
		
		return this.ResourcePath+data;
		
	}

}
