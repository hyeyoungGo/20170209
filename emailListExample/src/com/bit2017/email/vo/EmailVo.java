package com.bit2017.email.vo;

public class EmailVo {
	private Long no;
	private String fristName;
	private String lastName;
	private String email;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "EmailVo [no=" + no + ", fristName=" + fristName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
