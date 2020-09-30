package com.bridgelabz.problem;
public class Employee_Wage{
	public static void main(String[] args){
             //constants
             final int IS_PRESENT=0;
             //computation 
             double empCheck= Math.floor(Math.random()*10)%2;
	     if(empCheck==IS_PRESENT)
	        System.out.println("Employee is Present ");
             else
                System.out.println("Employee is Absent "); 	
	}

}
