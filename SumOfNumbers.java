package looping.control.statements;

public class SumOfNumbers {

	public static void main(String[] args) {
		int a = 0; //Starting range
		int b = 100;  //Ending range
		int sumtotal = 0;
		for (int i = a;i <= b; i++) {
			sumtotal += i;  //Assignment(addition) operator
		}
		System.out.println("The Total sum is:"+sumtotal);

	}

}
