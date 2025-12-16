public class divisiors {
    public static void main(String[] args) {
        int n=400;
        int div=2;
        while (div<=n/2) {
            if(n%div==0){
                System.out.println(div+"");
            }
            div++;
        }
    }
}
