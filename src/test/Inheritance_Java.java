package test;

class animal{
    void eat(){
        System.out.println("This method is from animal class 1 ");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("This method is from dog class 1 & 2 ");
    }
}

class cat extends dog{
    void drow(){
        System.out.println("This method is from cat class 1 & 2 & 3 ");
    }
}

public class Inheritance_Java {
    public static void main(String[] args){
        cat c = new cat();
        animal a = new animal();
        dog d = new dog();

        c.eat();
        a.eat();
        d.bark();
    }
}