package com.composite.pattern;

public class Accountant implements Employee {
	private int id;
	private String name;
	private Double salary;
	public Accountant(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void add(Employee employee){
		
	}
	public Employee getChild( int i){
		return null;
	}
	public String getName(){
		return name;
		
	}
	public double getSalary(){
		return salary;
	}
	public int getId(){
		return id;
		
	}
	
	public void print(){
		System.out.println("=========================");  
	       System.out.println("Id ="+getId());  
	       System.out.println("Name ="+getName());  
	       System.out.println("Salary ="+getSalary());  
	       System.out.println("=========================");  
	   }  
	    
	   public void remove(Employee employee) {  
		
	}

}
