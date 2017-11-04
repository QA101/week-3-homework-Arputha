
public class Do_WhilePrintSumOfFirstFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int total=0;
		do {
			if(a!=1) {
			
			System.out.print("+");}
			total +=a;
			System.out.print(a);
			a++;
		}while(a<=5);
		System.out.print("="+total);

	}

}
