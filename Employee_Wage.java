package com.bridgelabz.problem;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME=1;
	public static void calcEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHrs){
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
			   empWage=empHrs*empRatePerHr;
			   totalWage=empWage+totalWage;
			   System.out.println("Employee Wage on "+totalWorkingDays+" Day is: "+empWage);
			   if(totalWorkingDays==numOfWorkingDays||totalWorkingHour>=maxHrs)
				   break;
	       }
	 System.out.println("Total Employee Wage = "+totalWage);	
	 }
         public static void main(String[] args){
             calcEmpWage("Capgemini",20,2,10);
	     calcEmpWage("Bridgelabz",10,4,43);
	 }
}
