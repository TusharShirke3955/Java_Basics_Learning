import java.util.Arrays;

public class Shadowing {
    int a = 10;
    public static void main(String[] args){
        int a = 20;
//        Shadowing s = new Shadowing();
//        s.shadow();
        fun(10,20,30,52,72,6248,525,55);
        fun("tushar" , "shirke");
    }
    {
        System.out.println(a);
        int d = 40;
        System.out.println(d);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
