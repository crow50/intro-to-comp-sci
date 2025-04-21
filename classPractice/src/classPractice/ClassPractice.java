package classPractice;

public class ClassPractice {
	
	public static class Date {
		//fields
		private int year;
		private int month;
		private int day;

		//constructor
		public Date(int year, int month, int day) {
			setYear(year);
			setMonth(month);
			setDay(day);
		}
		
		public Date(Date other) {
			this (other.year, other.month, other.day);
		}
		
		// methods
		// Accessor - return information about state of object
		public int getDaysInMonth() {
			// in the context of an object
			if (month == 11 || month == 9 || month == 6 || month == 4) {
				return 30;
				
			}
			
			else if (month == 2) {
				//Checks for leap year
				if (isLeapYear()) {
					return 29;
				}
				return 28;
			}
			else {
				return 31;
			}
		}
		
		public boolean isLeapYear() {
			//Returns true or false depending on the year
			return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		}
		
		public int getDaysInYear() {
			if (isLeapYear()) {
				return 366;
			}
			else {
				return 365;
			}
		}
		// Mutator - change the state of the object
		public void nextDay() {
			// within same month
			// wrapping to next month
			// wrapping to next year
			day++;
			if (day > getDaysInMonth()) {
				month++;
				day = 1;
				if (month > 12) {
					month = 1;
					year ++;
				}
			}
		}
		
		//Methods behavior of date objects
		public int getDay() {
			return day;
		}
		
		public int getMonth() {
			return month;
		}
		
		public int getYear() {
			return year;
		}
		
		public void setYear(int year) {
			this.year = year;
		}
		
		public void setMonth(int month) {
			if (month < 1 || month > 12) {
				throw new IllegalArgumentException("Illegal Month: " + month);
			}
			this.month = month;
		}
		
		public void setDay(int day) {
			if (day < 1 || day > getDaysInMonth()) {
				throw new IllegalArgumentException("Illegal Day: " + day);
			}
			this.day = day;
		}
		
		public int daysBetween(Date other) {
			// count number of days
			int count = 0;
			
			// assumes first date is less than comparison date
			if (before(other)) {
				Date temp = new Date(this);
				while (temp.year != other.year 
						|| temp.month != other.month 
						|| temp.day != other.day) {
					temp.nextDay();
					count++;
				}
				return count;
			}
			else {
				Date temp = new Date(other);
				while (temp.year != year 
						|| temp.month != month 
						|| temp.day != day) {
					temp.nextDay();
					count++;
				}
				return count;
			}
		}
		public boolean before(Date other) {
			return year < other.year ||
					(year == other.year && (month < other.month ||
							month == other.month && day < other.day));
		}
	}
	
	public class DateMain {
	
		public static void main(String[] args) {
			
			Date d1 = new Date(2009, 12, 31);
			System.out.println(d1.getDaysInMonth());
			System.out.println(d1.isLeapYear());
			System.out.println(d1.getDaysInYear());
			System.out.println(d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
			d1.nextDay();
			System.out.println(d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
			
			Date d2 = new Date(2009, 5, 10);
			System.out.println(d2.getDaysInMonth());
			System.out.println(d2.isLeapYear());
			System.out.println(d2.getDaysInYear());
			System.out.println(d2.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
			d2.nextDay();
			System.out.println(d2.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
			
			Date d3 = new Date(d1);
			System.out.println(d3.getDaysInMonth());
			System.out.println(d3.isLeapYear());
			System.out.println(d3.getDaysInYear());
			System.out.println(d3.getYear() + "/" + d3.getMonth() + "/" + d3.getDay());
			d3.nextDay();
			System.out.println(d3.getYear() + "/" + d3.getMonth() + "/" + d3.getDay());

			System.out.println("");
			
			Date d4 = new Date(2010, 11, 30);
			System.out.println(d4.getYear() + "/" + d4.getMonth() + "/" + d4.getDay());
			d4.setMonth(10);
			d4.nextDay();
			System.out.println(d4.getYear() + "/" + d4.getMonth() + "/" + d4.getDay());
			
			System.out.println("");
			
			System.out.println(d1.daysBetween(d2));
			System.out.println(d1.daysBetween(d2));
			System.out.println(d2.daysBetween(d1));
			System.out.println(d3.daysBetween(d4));
			System.out.println(d4.daysBetween(d2));


		}
	} 	

}