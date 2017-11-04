
public class WhileLoopSumOfFirst5EvenNumbers {

	public static void main(String[] args) {
	
		int a=1;
		int total=0;
		while(a<=10) {
			if(a%2==0) {
				if(a!=2) {
				System.out.print("+");
				}
				System.out.print(a);
				total +=a;				
			}
			a++;
		}
		System.out.print("="+total);

	}

}
