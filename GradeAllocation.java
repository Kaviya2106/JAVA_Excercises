package decision.control.statements;

public class GradeAllocation {

	public static void main(String[] args) {
		int marks=75;
		 if(marks >= 90)
		 {
			 System.out.println("The Grade is O");
		 }
		 else if(marks >=80 && marks < 90)
		 {
			 System.out.println("The Grade is A+");
		 }
		 else if(marks >=70 && marks < 80)
		 {
			 System.out.println("The Grade is A");
		 }
		 else if(marks >=60 && marks < 70)
		 {
			 System.out.println("The Grade is B+");
		 }
		 else if(marks >=50 && marks < 60)
		 {
			 System.out.println("The Grade is B");
		 }
		 else
		 {
			 System.out.println("The Grade is RA"); 
		 }
		

	}

}
