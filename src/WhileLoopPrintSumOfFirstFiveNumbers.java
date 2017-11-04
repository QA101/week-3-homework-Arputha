
public class WhileLoopPrintSumOfFirstFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, total;
		a=1;
		total=0;
		while(a<=5) {
			if ( a!=1) {
			System.out.print("+");
			}
			total +=a;
			
			System.out.print(a);
			a++;
			
		}
		System.out.print("="+total);
		

	}

}
