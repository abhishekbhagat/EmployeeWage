package com.bridgelabz.problem;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME=1;
	public static final int Emp_Wage_Per_Hour=20;
	public static final int MAX_OF_WORKING_DAY=20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static void computeEmpWage(){
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
			   empWage=empHrs*Emp_Wage_Per_Hour;
			   totalWage=empWage+totalWage;
			   System.out.println("Employee Wage on "+totalWorkingDays+" Day is: "+empWage);
			   if(totalWorkingDays==MAX_OF_WORKING_DAY ||totalWorkingHour>=MAX_HRS_IN_MONTH)
				   break;
			   }
	  System.out.println("Total Employee Wage = "+totalWage);	
	  }
	  public static void main(String[] args){
	      computeEmpWage();
	  }
}
