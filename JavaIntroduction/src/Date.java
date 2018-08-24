
public class Date {
	private int day,year;
	private String month;
	
	public Date() {
		this.day=2;
		this.month="August";
		this.year=2018;
	}
	
	public Date(int day, String month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public void display() {
		System.out.println("Day:"+day);
		System.out.println("Month:"+month);
		System.out.println("Year:"+year);
	}
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
