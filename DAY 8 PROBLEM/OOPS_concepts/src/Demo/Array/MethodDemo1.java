package Demo.Array;
import java.util.Arrays;
import java.util.Scanner;
public class MethodDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		MethodDemo1 m=new MethodDemo1();
		int res[]=m.sortArraybyparity(a);
		System.out.println(Arrays.toString(res));
     }
	int[]sortArraybyparity(int[]nums){
		int st=0,end=nums.length-1;
		while(st<end) {
			if(nums[st]%2==0) {
				st++;
			}if(nums[end]%2!=0) {
				end--;
			}else {
				int temp=nums[st];
				nums[st]=nums[end];
				nums[end]=temp;
				st++;
				end--;
			}
		}
		return nums;
	}
	
	

}
