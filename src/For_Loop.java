import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        For_Loop fr = new For_Loop();
//        fr.for1();
        fr.for5();
    }

    public void for1(){
        int x = 50;
        for(int y = 1; y <= x ; y++){
            System.out.println("for loop excecuted  " + y);
        }
    }

    public void for2(){
        int a = 20;
        for(int x = 1 ; x<= a ; x++){
            System.out.println(x);
        }
    }

    public void for3(){
        int[] arr = {10,20,30,40,2,5,6};
        for (int arr1 : arr){
            System.out.println(arr1);
        }
    }

    public void for4(){
        for(int i = 1 ; i <= 10 ; i++){
            for(int y = 1 ; y <= i ; y++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void for5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int i = sc.nextInt();
        while(i <= 10){
            System.out.println(" Test while loop :" + i);
            i++;
        }
    }
}
