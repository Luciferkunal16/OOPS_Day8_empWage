package Line_Conversion;

public class Oops_Employee_Wage {
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;
public static final int NUM_OF_WORKING_DAYS=20;
public static final int MAX_HRS=100;

static int computeWage() {
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
	while (totalEmpHrs <=MAX_HRS && totalWorkingDays <NUM_OF_WORKING_DAYS) {
		totalWorkingDays++;
		int attendence=(int)((Math.random()*10)%3);
		switch (attendence) {
		case IS_PART_TIME:
			empHrs=4;
			break;
		case IS_FULL_TIME:
			empHrs=8;
			break;
		default:
			empHrs=0;
			break;
			
		}
		totalEmpHrs=empHrs+totalEmpHrs;
		System.out.println("No. of Days: "+ totalWorkingDays +" Total Hours is "+empHrs);
	
	
	}
	int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
	return totalEmpHrs;
	
	
	
}
public static void main(String[] args) {
	System.out.println("Total Employee wage is "+computeWage());
}
}
