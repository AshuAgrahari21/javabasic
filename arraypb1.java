import java.util.Scanner;
//find index of below 35

public class arraypb1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       //  int a=sc.nextInt();
         int a[]={14,56,45,23,43,21};
         int d = a.length;
        for(int i=0;i<d;i++){
           // d[i]=sc.nextInt();
            if(a[i]<35)
                System.out.println(i);

            
            
        }

    }
}
