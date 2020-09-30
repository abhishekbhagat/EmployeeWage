package com.bridgelabz.problem;
public class Employee_Wage{
	public static void main(String[] args){
        //constants
	final int IS_FULL_TIME = 0;
        final int IS_PART_TIME=1;
        int EMP_WAGE_PER_HOUR=20;
        //variables
        int empHrs=0;
	int empWage=0;
          //Computation
	int empCheck= (int)Math.floor(Math.random()*10)%2;
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
	empWage=empHrs*EMP_WAGE_PER_HOUR;
	System.out.println("Employee Wage = "+EMP_WAGE_PER_HOUR);	
	}
}