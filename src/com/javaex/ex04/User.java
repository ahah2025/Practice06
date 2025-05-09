//부모클래스
package com.javaex.ex04;

public class User {
	
	//필드
	protected String id; //아이디
	protected String password; //패스워드
	private String name; //이름

	//생성자
	public User() {
		super();
	}

	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	//메소드gs
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "#"+"아이디:"+id + ", #패스워드:" + password + ","+ " #이름:"+name+", "+"#포인트:";
	}
	
	public void showInfo() {
		System.out.print("#아이디:"+id+", ");
		System.out.print("#패스워드:"+password+", ");
		System.out.println("#이름:"+name+",");
		//System.out.println("포인트:"+point);
	}

	


	
}
