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
	double empCheck= Math.floor(Math.random()*10)%2;
	if(empCheck==IS_FULL_TIME)
		empHrs=8;
        else
                empHrs=4;
	empWage=empHrs*EMP_WAGE_PER_HOUR;
	System.out.println("Employee Wage = "+EMP_WAGE_PER_HOUR);	
	}
}