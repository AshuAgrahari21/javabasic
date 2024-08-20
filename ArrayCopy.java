import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        for(int ele:arr){ // for each loop using here
            System.out.print(ele+" ");
        }
        //shallow copy
        System.out.println();
        int nums[]=arr;
        for(int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        nums[0]=70;
        System.out.println(nums[0]);
        //deep copy
        System.out.println();
        int brr[]=Arrays.copyOf(arr,arr.length);
        for(int ele:brr){
            System.out.print(ele+" ");
        }
        System.out.println();
        brr[0]=70;
        System.out.println(brr[0]);
    }
}
