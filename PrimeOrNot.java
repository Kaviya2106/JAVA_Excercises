package looping.control.statements;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 22;
		if (num == 0 || num ==1) {
			System.out.println("The given num is Not a Prime Number");
			
		}
		else {
			for (int i = 2;i <= num ; i++) {
				if (num % 1 == 0) {
				System.out.println("The given num is not a Prime Number");
				break;
			    }
				else {
					System.out.println("The given num is a Prime Number");
				}
					
			}
		}

	}
}


