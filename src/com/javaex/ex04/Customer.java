package com.javaex.ex04;

public class Customer extends User { //고객
	
	//필드
	private int point; //포인트점수

	//생성자
	public Customer() {
		super();
	}

	public Customer(String id,String password,String name,int point) {
		super(id,password,name);
		this.point = point;
	}

	//메소드gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	//메소드일반
	@Override
	public String toString() {
		return "아이디:"+id+","+"#패스워드"+password + point;
	}

	public void showInfo() {
		System.out.print("아이디"+super.getId());
		System.out.print("패스워드:"+super.getPassword());
		System.out.print("이름:"+super.getName());
		System.out.print("포인트:"+this.point);
	}
	

}
