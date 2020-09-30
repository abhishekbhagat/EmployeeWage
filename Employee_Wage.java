package com.bridgelabz.problem;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
        public static final int IS_PART_TIME=1;
        public static final int EMP_WAGE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=25;
	public static void main(String[] args){
        //variables
        int empHrs=0;
	int empWage=0;
        int totalWage=0;
          //Computation
	int empCheck= (int)Math.floor(Math.random()*10)%2;
        for(int day=1;day<=NUM_OF_WORKING_DAYS;day++){
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
        totalWage+=empWage;
	System.out.println("Employee Wage = "+EMP_WAGE_PER_HOUR);
        }
        System.out.println("Total Employee Wage = "+Totalwage);
    }
}