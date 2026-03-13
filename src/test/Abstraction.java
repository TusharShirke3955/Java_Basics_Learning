package test;

abstract class Abstract {
    abstract int add(int a , int b);
    abstract int sub(int c , int d);
}

interface Vehicle{
    void start();
    void Model();
    void stop();
}

class Mahindra implements Vehicle{
    public void start(){
        System.out.println("Engine Start of Mahindra XUV700");
    }
    public void Model(){
        System.out.println("Mahindra = XUV700");
    }
    public void stop(){
        System.out.println("Stop Engine of Mahindra XUV700");
    }
}

class Hyundai implements Vehicle{
    public void start(){
        System.out.println("Engine Start of Alcazar");
    }
    public void Model(){
        System.out.println("Hyundai = Alcazar");
    }
    public void stop(){
        System.out.println("Stop Engine of Alcazar");
    }
}

public class Abstraction extends Abstract {
    @Override
    int add(int a, int b) {
        int c = a + b;
        return c;
    }
    @Override
    int sub(int c , int d){
        int e = c - d;
        return e;
    }

    void eat(){
        System.out.println("it is normal methods");
    }

    public static void main(String[] args){
        Abstraction ab = new Abstraction();
        System.out.println(ab.add(10,30));
        System.out.println(ab.sub(1000,600));
        ab.eat();
        Mahindra mh = new Mahindra();
        Hyundai hy = new Hyundai();
        mh.start();
        mh.Model();
        mh.stop();
        System.out.println("       ");
        hy.start();
        hy.Model();
        hy.stop();
    }
}

