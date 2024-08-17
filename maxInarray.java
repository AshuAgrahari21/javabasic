
import java.util.Scanner;

public class maxInarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1000,20,30,45,432,3,123,456,21,24,564,900};
        int max=Integer.MIN_VALUE; //min value for int
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
               
            }
             
        }
        System.out.println("Maximum numer in array after 0 index "+max);
       
    }
}
