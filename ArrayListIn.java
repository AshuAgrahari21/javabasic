import java.util.ArrayList;

public class ArrayListIn {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(4);
        arr.add(0,10); // intialize , add use to add iniatalise the value
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        System.out.println("Size of array is "+ arr.size());
        System.out.println(arr.get(0)); //for arr[0] , get use to get the value
        System.out.print(arr); //for all index
        System.out.println();
        arr.set(3,4000); // set use to modified the values
        System.out.print(arr);
        System.out.println();
        arr.add(60); // here add use without index value , for adding the element in the  array, push back
        System.out.print(arr);
        System.out.println();
        System.out.println("Size of new array is " + arr.size());
        arr.remove(3);
        System.out.println(arr);
    }
    
}
