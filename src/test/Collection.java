package test;
import java.util.*;

public class Collection {

    public static void main(String[] args){
        Collection cl = new Collection();
//        cl.ArrayList();
//        cl.SetList();
        cl.queue();
        cl.hashmap();
    }

    public void arraylist(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(400);
        arr.add(500);
        arr.add(8);
        System.out.println(arr);
        for (int a : arr){
            System.out.println(a);
        }
    }

    public void setlist(){
        HashSet<Integer> hss = new HashSet<>();
        HashSet<String> str = new HashSet<>();
        str.add("Tushar");
        str.add("Shirke");
        str.add("Tushar");
        hss.add(100);
        hss.add(200);
        hss.add(100);
        hss.add(300);
        System.out.println(hss);
        System.out.println(str);
        for (int hs : hss){
            System.out.println(hs);
        }
    }

    public void queue(){
        PriorityQueue<Integer> prq = new PriorityQueue<>();
        prq.add(10);
        prq.add(10);
        prq.add(150);
        prq.add(5);
        System.out.println(prq);
        for(int a : prq){
            System.out.println(a);
        }
    }

    public void hashmap(){
        HashMap<Integer,String> hp = new HashMap<>();
        hp.put(1,"Tushar Shirke");
        hp.put(2,"Sourabh");
        hp.put(3,"Yogesh");
        hp.put(4,"Tushar Shirke");
        System.out.println(hp);
    }
}
