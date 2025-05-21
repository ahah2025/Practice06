package com.javaex.ex04;

public class Employee extends User{ //직원

	//필드
	private int salary; //급여

	//생성자
	public Employee() {}

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
		System.out.println("#아이디:" + id+ ", #패스워드:" + password + ", #이름:" + super.getName()  + ", #월급:" + salary );
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", id=" + id + ", password=" + password + ", name=" + super.getName() + "]";
	}
	

	
}
