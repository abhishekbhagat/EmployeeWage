package com.bridgelabz.problem;
import com.bridgelabz.problem.IComputeEmpWage;
import com.bridgelabz.problem.CompanyEmpWage;
public class Employee_Wage{
	public static final int IS_FULL_TIME = 0;
	public static final int IS_PART_TIME=1;
	private  LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	public EmpWageBuilder()
	{
		companyEmpWageList=new LinkedList<>();
		companyToEmpWageMap=new HashMap<>();
	}
	
	public static void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth)
		companyEmpWageList.add(companyEmpWage);
                companyToEmpWageMap.put(company,companyEmpWage);
	}
	public void computeEmpWage(){
		for(int i=0;i<companyEmpWageList;i++){
                        CompanyEmpWage companyEmpWage= companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
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
			   empWage=empHrs*companyEmpWage.getEmpRatePerHour();
			   totalWage=empWage+totalWage;
			   System.out.println("Employee Wage on "+totalWorkingDays+" Day is: "+empWage);
			   if(totalWorkingDays==companyEmpWage.numOfWorkingDays||totalWorkingHour>=companyEmpWage.maxHoursPerMonth)
				   break
	         }
	companyEmpWage.setTotalEmpWage(totalWage);
	System.out.println("Total Employee Wage = "+companyEmpWage.totalEmpWage);	
	return companyEmpWage.totalEmpWage;
	}
	public static void main(String[] args){
	    Employee_Wage empWager =new Employee_Wage();
	    empWage.addCompanyEmpWage("capgemini", 20,22,120);
	    empWage.addCompanyEmpWage("bridgelabz", 20,22,120);
	    empWage.computeEmpWage();
	    
	    
       }
}
