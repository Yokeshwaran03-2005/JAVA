public class Fibanocci {
 public static void main(String[] args) {
     int a=0,b=1;
     int n=2;
     System.out.println(a + ""+ b+ "");
     for(int i =1;i <= n;i++){
        int c =a+b;
        System.out.print(c+" ");
        a = b;
        b = c;
     }
 }    
}
