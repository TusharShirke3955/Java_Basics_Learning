package test;

public class Methods_Java {
    public static void main (String[] args){
        Methods_Java msj = new Methods_Java();
        System.out.println(msj.addition(10,30,10));
//        System.out.println(msj.prasad(10,20));
//        System.out.println(msj.prasad(10,10));
//        System.out.println(msj.shirke());
//        tushar(50,20);
//        msj.harshit(20,5);

    }
    public int prasad(int a , int b){
        int c = a+b;
        return c;
    }

    public int addition(int a , int b ){
        int c = a + b;
        return c;
    }

    public int addition(int a , int b , int c){
        int d = a + b + c;
        return d;
    }

    public float prasad(float x , float y){
        float z = x + y;
        return z;
    }

    public static void tushar(int d , int e){
        int f = d - e;
        System.out.println(f);
    }

    public String shirke(){
        String name = "Tushar_Shirke";
        return name;
    }

//    public void harshit(int x,int y){
//        int z = x * y;
//        System.out.println(z);

    int p = 10;
    int r = 30;

//    if (p > 50){
//        System.out.println("Condition matched");
//    }
//    else{
//        System.out.println("Not Matched");
//    }

}
