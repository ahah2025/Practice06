package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열 만들기
		User[] userArr = new User[3];
		
		//메모리에 올린다
		User u1 = new Customer("jws","j1234","정우성",1000);
		User c1 = new Customer("yjs","y2345","이효리",2000);
		User e1 = new Employee("master","m7788","운영자",5000000 );
		
		userArr[0]=u1;
		userArr[1]=c1;
		userArr[2]=e1;
		
		for(int i=0; i<userArr.length; i++) {
			userArr[i].showInfo();
		}
		
		int salary = ((Employee)userArr[2]).getSalary();
		System.out.println("운영자의 월급은 " + salary + "원 입니다.");		
		
	}
}
