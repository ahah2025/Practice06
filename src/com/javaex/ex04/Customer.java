package com.javaex.ex04;

public class Customer extends User { //고객
	
	//필드
	private int point; //포인트점수

	//생성자
	public Customer() {}

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
	public void showInfo() {
		System.out.println("#아이디:" + id+ ", #패스워드:" + password + ", #이름:" + super.getName()  + ", #포인트:" + point );
	}
	
	@Override
	public String toString() {
		return "Customer [point=" + point + ", id=" + id + ", password=" + password + ", name=" + super.getName() + "]";
	}
}
