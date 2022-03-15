
public class AccessSpecifiers {
	public int a,b=21;
	public void DisplayNos() {
		System.out.println("The Nos are:"+a +b);
	}
	class C1{
		protected int sum = a + b;
		protected void DisplaySum() {
			System.out.println("The Sum:"+sum);
			}
		
	}
	class C2 extends C1{
		private float avg = sum / 2;
		private void DisplayAvg() {
			System.out.println("The Average :"+avg);
		}
	}
	
	class c3 {
		void arithmetic() {
			System.out.println("Multiply:"+a*b);
			System.out.println("Divide:"+a/b);			
		}
		
	}

	public static void main(String[] args) {
		 AccessSpecifiers obj = new  AccessSpecifiers();
		 obj.DisplayNos();
		 //obj.DisplaySum();
		 //obj.DisplayAvg();
		 //obj.arithmetic();
		 

	}

}
