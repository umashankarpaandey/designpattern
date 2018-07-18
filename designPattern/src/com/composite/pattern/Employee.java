package com.composite.pattern;

public interface Employee {
	public int getId();//marketplace.eclipse.org/marketplace-client-intro?mpc_install=495
	public String getName();
	public double getSalary();
	public void print();
	public void add(Employee employee);
	public void remove(Employee employee);
	public Employee getChild(int i);
	//marketplace.eclipse.org/marketplace-client-intro?mpc_install=495

}
