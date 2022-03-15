package decision.control.statements;

public class LeapYear {

	public static void main(String[] args) {
		int year=1999;
		if(year %4==0 || year %400==0)
		{
			System.out.println("The Given Year is Leap Year ");
		}
		else
		{
			System.out.println("The Given Year is Not a Leap Year"); 
		}
	}

}
