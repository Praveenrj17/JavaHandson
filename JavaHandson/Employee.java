package com.java.in;

public class Employee {
	private long employeeId;
	private String employeeName	;
	private String employeeAddress	;
	private long employeePhone;
	private  double basicSalary;
	private double specialAllowance=250.80d;
	private double Hra	=1000.50d;
	

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	
	}
public double calculateSalary()
{
      double salary=basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
           System.out.println("Salary: "+salary);	
	        return salary;
}
public double calculateTransportAllowance()
{
	double transportAllowance = 10/100*basicSalary;

	System.out.println("Transport Allowance: "+transportAllowance);
	return transportAllowance;
}
	public  class Manager extends Employee
	{
		  public  Manager(long Id, String Name, String Address, long Phone, double salary) {
			super(Id, Name, Address, Phone, salary);
			}
	public double calculateTransportAllowance()
	{
		double transportAllowance1 = 15/100* basicSalary;
		System.out.println("Transport Allowance: "+transportAllowance1);
		return transportAllowance1;
	}
	public  class Trainee extends Employee
	{
		public Trainee(long Id, String Name, String Address, long Phone, double salary) {
			super(Id, Name, Address, Phone, salary);
		}
	}	
	}
}

