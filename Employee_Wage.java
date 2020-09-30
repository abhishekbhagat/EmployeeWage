package com.bridgelabz.problem;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
        public static final int IS_PART_TIME=1;
        public static final int EMP_WAGE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=25; 
        public static final int MAX_HRS_IN_MONTH=100;
       
	public static void main(String[] args){
        //variables
        int empHrs=0;
	int empWage=0;
        int totalWage=0;
        int totalWorkingDays=0;
          //Computation
        while(true){
        totalWorkingDays++;
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
        totalWage+=empWage;
        totalWorkingHour+=empHrs;
	System.out.println("Employee Wage = "+EMP_WAGE_PER_HOUR);
        if(totalWorkingDays==NUM_OF_WORKING_DAYS ||totalWorkingHour>=MAX_HRS_IN_MONTH)
			   break;
        }
        System.out.println("Total Employee Wage = "+totalWage);
    }
}
