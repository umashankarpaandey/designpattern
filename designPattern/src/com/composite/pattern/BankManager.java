package com.composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {
	private int id;
	private String name;
	private double salary;
	public BankManager(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	List<Employee>employees= new ArrayList<Employee>();
	
	public void add(Employee employee ){
		employees.add(employee);
	}
	public Employee getChild(int i){
		return employees.get(i);
		}
	public void remove(Employee employee){
		employees.remove(employee);
		
	}
	public int getId(){
		return id;
		
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public void print(){
		System.out.println("===============================");
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);
		System.out.println("================================");
		Iterator<Employee>it=employees.iterator();
		while(it.hasNext()){
		Employee employee=it.next();
		employee.print();
		}
	}

}
