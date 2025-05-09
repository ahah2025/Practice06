package com.javaex.ex06;

public class MyBase extends Base{

	//필드
	private String day; //낮
	private String night; //밤
	private String afternoon; //오후
	
	//생성자
	public MyBase() {
		super();
	}

	public MyBase(String day, String night, String afternoon) {
		super();
		this.day = day;
		this.night = night;
		this.afternoon = afternoon;
	}

	//메소드gs
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getNight() {
		return night;
	}

	public void setNight(String night) {
		this.night = night;
	}

	public String getAfternoon() {
		return afternoon;
	}

	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}
	
	public void service(String state) {
		System.out.println("낮에는 열심히 수업듣자");
		System.out.println("밤에는 숙면");
		System.out.print("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
	
}
