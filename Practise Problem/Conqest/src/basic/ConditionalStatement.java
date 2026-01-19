package basic;

public class ConditionalStatement {

	public static void main(String[] args) {
		char attendance='p';
		int total=40;
		if(attendance=='p') {
			if(total<=50) {
			System.out.println("Attended the class");
			}
		}else if(attendance=='a'){ 
			System.out.println("Not Attended the class");
		}else if(attendance=='o') {
			System.out.println("onduty");
		}else {
			System.out.println("absent");
		}
		System.out.println("Program Ends");

	}

}
