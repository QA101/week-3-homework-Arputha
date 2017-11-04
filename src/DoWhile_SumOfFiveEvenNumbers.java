
public class DoWhile_SumOfFiveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int total=0;
		do {
			if(a%2==0) {
				if(a!=2) {
					System.out.print("+");
				}
				System.out.print(a);
				total +=a;
				
			}
			a++;
		}while(a<=10);
		System.out.print("="+total);
	}

}
