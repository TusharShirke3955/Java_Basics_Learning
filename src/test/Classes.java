package test;

class Classe {

    String name;
    int age;
    void display(){
        System.out.println(name + "  " + age);
    }
}

public class Classes{
    public static void main(String[] args){
        Classe cl = new Classe();
        cl.name = "Test";
        cl.age = 20;
        cl.display();
    }
}


