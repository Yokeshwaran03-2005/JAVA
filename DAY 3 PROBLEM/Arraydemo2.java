public class Arraydemo2 {
       public static void main(String[] args) {
          int a[]={90,23,45,67,25};
          int first=Integer.MAX_VALUE;
          int Second=Integer.MAX_VALUE;
          int third=Integer.MAX_VALUE;
          int fourth=Integer.MAX_VALUE;
          int fivth=Integer.MAX_VALUE;

        //iterate
        for(int i=0;i<a.length;i++){
            if(a[i]<first){
                fivth =fourth;
                fourth=third;
                third=Second;
                Second=first;
                first=a[i];
            }else if (a[i]<Second){
                fivth=fourth;
                fourth=third;
                third=Second;
                Second = a[i];

            }else if(a[i]<third){
                fivth =fourth;
                fourth=third;
                third=a[i];

            }else if(a[i]<fourth){
                fivth=fourth;
                fourth=a[i];
            }else if(a[i]<fivth){
                fivth = a[i];
            }
        }
        System.out.println( "4th smallest:" + fivth);
       }    
}
