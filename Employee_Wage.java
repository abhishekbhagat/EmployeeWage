package com.bridgelabz.problem;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME=1;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	//constants
	public Employee_Wage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void computeEmpWage(){
		//variables
		int totalWage=0;
		int totalWorkingHour=0;
		int totalWorkingDays=0;
		//computation
		while(true){
			   int empHrs=0,empWage=0;
			   int  empCheck= (int)Math.floor(Math.random()*10)%2;
			   switch(empCheck){
			     case IS_FULL_TIME:
			    	 empHrs=8;
			         break; 
			     case IS_PART_TIME:
			    	 empHrs=4;
			         break;
			     default:
			    	 empHrs=0;
			   }
			   totalWorkingHour=empHrs+totalWorkingHour;
			   totalWorkingDays++;
			   empWage=empHrs*empRatePerHour;
			   totalWage=empWage+totalWage;
			   System.out.println("Employee Wage on "+totalWorkingDays+" Day is: "+empWage);
			   if(totalWorkingDays==numOfWorkingDays||totalWorkingHour>=maxHoursPerMonth)
				   break;
			   }
	  System.out.println("Total Employee Wage = "+totalWage);	
	  }
	  public static void main(String[] args){
	    Employee_Wage capgemini =new Employee_Wage ("capgemini",20,2,10);
	    Employee_Wage  bridgelabz=new Employee_Wage ("bridgelabz",20,5,30);
	    capgemini.computeEmpWage();
	    bridgelabz.computeEmpWage();
	    
	  }
}
