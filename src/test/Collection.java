package test;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("Indore","Mumbai","Pune"));

//        for (String y : arr1){
//            System.out.println(y);
//        }

        System.out.println(arr1);

//        arr1 = [White,Black,Blue,Brown]
        arr.add("White");
        arr.add("Black");
        arr.add("Blue");
        System.out.println(arr);
//        for(String n : arr){
//            System.out.println("Excecution of for loop : " + n);
//        }

//        System.out.println(arr);
//        System.out.println("Print the value of 0 index : " + arr.get(0));
////
////      ## Update the Value of index 1
//        arr.set(1 , "Brown");
//        System.out.println(arr);
////
//        arr.remove("Blue");
//        System.out.println(arr);
    }
}
