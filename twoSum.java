public class twoSum {
    //find the to number , sum of 9;
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int target=9;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }

            }
        }

    }
    
}
