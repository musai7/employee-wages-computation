package com.empwageproject.empwagelogics;

public class DailyEmpWage {
	//employee present or absent logic
	
		public static void main(String[] args) {
		
			double empCheck = Math.floor(Math.random() * 10) % 2;
			// constants
			int is_present = 1, empWagePerHr = 20, is_fullTime = 8;

			int totalEmpWagePerDay = 0;
			if (empCheck == is_present) {
				totalEmpWagePerDay = is_fullTime * empWagePerHr;
				System.out.println("employee is present and employee wage is : " + totalEmpWagePerDay);
			} else
				System.out.println("employee is abscent and employee wage is : " + totalEmpWagePerDay);
		}

}
