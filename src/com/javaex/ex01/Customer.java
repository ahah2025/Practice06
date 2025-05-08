//.자식 클래스
package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNo; //고객번호
	private int point; // 포인트점수
	
	//생성자
	public Customer() {
		super("정우성","010-1111-2222");
	}
	
	public Customer(int cNo, int point) {
		this.cNo = cNo;
		this.point = point;
	}

	public Customer(String name, String hp,int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	//메소드gs
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	//메소드 일반
	public void showInfo() {
		System.out.print("#이름:"+super.getName()+","+"\t");
		System.out.print("#핸드폰:"+super.getHp()+","+"\t");
		System.out.print("#고객번호:"+this.cNo+","+"\t");
		System.out.print("#포인트점수:"+this.point);
	}
}
