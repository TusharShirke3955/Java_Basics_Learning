import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<Integer>();

//        / add values in a list
        ar.add(10);
        ar.add(20);
        ar.add(5);
        ar.add(12);
        System.out.println(ar);

//        / get the element by index
//        System.out.println("Getting the 2nd Index : "+ ar.get(2));

//        / adding element in a specific index
//        ar.add(1,200);
//        System.out.println("Added element at 1st index : " + ar);

//        / set element at a specific index
//        ar.set(0,150);
//        System.out.println("Set Element at 0th Index : "+ ar);

//        / Delete element from index
//        ar.remove(1);
//        System.out.println("Removed 1st index : " + ar);
//
////        / Size of List
//        int sz = ar.size();
//        System.out.println("Size of list : " + sz);

//        / Loops on List
        for (int i = 0; i < ar.size();i++){
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();

        Collections.sort(ar);
        System.out.println("Sorted ArrayList : " + ar);
    }
}
