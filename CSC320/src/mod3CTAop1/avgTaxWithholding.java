package mod3CTAop1;

import java.util.Scanner;

public class avgTaxWithholding {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		int weeklyIncome;
	    
	    System.out.print("Enter weekly income: ");
	    weeklyIncome = scnr.nextInt();

	        if(weeklyIncome < 500) {
	            double avgWeeklyIncome = weeklyIncome - (weeklyIncome * 0.10);
	            System.out.println("Tax rate is 10%");
	            System.out.println("Average weekly income after taxes is " + avgWeeklyIncome);
	        }
	        else if((weeklyIncome >= 500) && (weeklyIncome < 1500)) {
	            double avgWeeklyIncome = weeklyIncome - (weeklyIncome * 0.15);
	            System.out.println("Tax rate is 15%");
	            System.out.println("Average weekly income after taxes is " + avgWeeklyIncome);
	        }
	        else if((weeklyIncome >= 1500) && (weeklyIncome < 2500)) {
	            double avgWeeklyIncome = weeklyIncome - (weeklyIncome * 0.20);
	            System.out.println("Tax rate is 20%");
	            System.out.println("Average weekly income after taxes is " + avgWeeklyIncome);
	        }
	        else {
	            double avgWeeklyIncome = weeklyIncome - (weeklyIncome * 0.30);
	            System.out.println("Tax rate is 30%");
	            System.out.println("Average weekly income after taxes is " + avgWeeklyIncome);

	        }

	    }
	}

