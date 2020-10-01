package com.bridgelabz.problem;
import com.bridgelabz.problem.IComputeEmpWage;
import com.bridgelabz.problem.CompanyEmpWage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Employee_Wage implements IComputeEmpWage{
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME=1;
	private  LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	public Employee_Wage(){
		companyEmpWageList=new LinkedList<>();
		companyToEmpWageMap=new HashMap<>();
	}
	public void computeEmpWage(){
		for(int i=0;i<companyEmpWageList.size();i++){
			CompanyEmpWage companyEmpWage= companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public int computeEmpWage(CompanyEmpWage companyEmpWage){
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
			 empWage=empHrs*companyEmpWage.getEmpRatePerHour();
			 totalWage=empWage+totalWage;
			 System.out.println("Employee Wage on "+totalWorkingDays+" Day is: "+empWage);
			 if(totalWorkingDays==companyEmpWage.numOfWorkingDays()||totalWorkingHour>=companyEmpWage.getmaxHoursPerMonth())
				   break;
	       }
          companyEmpWage.setTotalEmpWage(totalWage);
	  System.out.println("Total Employee Wage = "+companyEmpWage.totalEmpWage);	
	  return companyEmpWage.totalEmpWage;
	  }
	  public int getTotalWage(String company){
		  return companyToEmpWageMap.get(company).totalEmpWage;
	  }
	  public static void main(String[] args){
	      Employee_Wage empWage =new Employee_Wage EmpWage();
	      empWage.addCompanyEmpWage("capgemini", 20,22,120);
	      empWage.addCompanyEmpWage("bridgelabz", 10,22,20);
	      empWage.computeEmpWage();
	  }
}
