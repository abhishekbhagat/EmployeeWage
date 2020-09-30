package com.bridgelabz.problem;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME=1;
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	public Employee_Wage()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	public static void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth)
		numOfCompany++;
	}
	public void computeEmpWage(){
		for(int i=0;i<numOfCompany;i++){
			companyEmpWageArray[i].setTotalEmpWaage(this.computeEmpwage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
		private int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
			   empWage=empHrs*CompanyEmpWage.empRatePerHour;
			   companyEmpWage.totalEmpWage=empWage+companyEmpWage.totalEmpWage;
			   System.out.println("Employee Wage on "+totalWorkingDays+" Day is: "+empWage);
			   if(totalWorkingDays==companyEmpWage.numOfWorkingDays||totalWorkingHour>=companyEmpWage.maxHoursPerMonth)
				   break;
	         }
	  System.out.println("Total Employee Wage = "+companyEmpWage.totalWage);	
	  return companyEmpWage.totalWage;
	  }
	  public static void main(String[] args){
	    Employee_Wage empWager =new Employee_Wage();
	    empWage.addCompanyEmpWage("capgemini", 20,22,120);
	    empWage.addCompanyEmpWage("bridgelabz", 20,22,120);
	    empWage.computeEmpWage();
	    
	    
	  }
}
