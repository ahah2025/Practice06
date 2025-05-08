package com.javaex.ex04;

public class Employee extends User{ //직원

	//필드
	private int salary; //급여

	//생성자
	public Employee() {
		super();
	}

	public Employee(String id,String password,String name, int salary) {
		super(id,password,name);
		this.salary = salary;
	}

	//메소드gs
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	//메소드일반
	public void showInfo() {
		System.out.print("아이디"+super.getId());
		System.out.print("패스워드:"+super.getPassword());
		System.out.print("이름:"+super.getName());
		System.out.print("월급:"+this.salary);
	}

	
}
