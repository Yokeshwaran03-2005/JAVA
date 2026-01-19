package basic;

public class Whilelopp {

	public static void main(String[] args) {
		int n=50;
		int i=1;
		int sum=0;
		/*while(i<=n) {
			 sum+= i;
			i++;*/
		
		do {
			sum+=i;
			i++;
		}while(i<=n);
		System.out.println(i);

	}

}
