package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열 만들기
		User[] userArr = new User[3];
		
		//메모리에 올린다
		User u1 = new User("jws","j1234","정우성");
		Customer c1 = new Customer("yjs","y2345","이효리",2000);
		Employee e1 = new Employee("master","m7788","운영자",500);
		
		
		userArr[0]=u1;
		userArr[1]=c1;
		userArr[2]=e1;
		
		System.out.println(u1.toString());
		//u1.showInfo();
	
		//c1.showInfo();
		System.out.println(c1.toString());
		
		e1.showInfo();
		
	}

}
/*
정우성 포인트 값이  안 나옴
#아이디:jws, #패스워드:j1234, #이름:정우성, #포인트:
#아이디:yjs, #패스워드:y2345, #이름:이효리, #포인트:2000
#아이디:master, #패스워드:m7788, #이름:운영자, #월급:500
*/