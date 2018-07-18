package com.composite.pattern;

public class Cashier implements Employee {
	private int id;
	private double salary;
	private String name;
	public Cashier(){}
	public Cashier(int id,String name,double salary) {
		super();
		this.id = id;
		
		this.name=name;
		this.salary = salary;
	}
	public void add(Employee employee){
		
	}
	public Employee getChild(int i){
		return null;
		
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
		
	}
	public void print() {  
        System.out.println("==========================");  
        System.out.println("Id ="+getId());  
        System.out.println("Name ="+getName());  
        System.out.println("Salary ="+getSalary());  
        System.out.println("==========================");  
    }  
    @Override  
    public void remove(Employee employee) {  
	
	
    }
}
