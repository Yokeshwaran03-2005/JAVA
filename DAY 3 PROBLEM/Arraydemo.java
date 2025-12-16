public class Arraydemo {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int max=a[0];

        // iterate
        for(int i=1;i<a.length; i++){
            if(a[i]>max){     // to find min(a[i]<min)
                max = a[i];
            }
        }
        System.out.println(max);
    }
    
}
