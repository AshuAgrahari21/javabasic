public class secondLargestInArray {
    public static void main(String[] args) {
        int arr[]={12,32,14,35,43,56,21,35,67,54,32,14,96,43,567,5,43,234,456,54,3,4,1,0};
        int max=Integer.MIN_VALUE; //min value for int
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
               
            }
             
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != max){
                smx=Math.max(smx,arr[i]);
               
            }
             
        }
        System.out.println("Maximum element in array "+max);
        System.out.println("2nd largest element in this array "+smx);
    }
}
