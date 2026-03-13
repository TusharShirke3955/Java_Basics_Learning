package test;

public class Encapsulation_Java {
    public static void main(String[] args){
        Salary s = new Salary();
        s.setSalary(25000);
        System.out.println(s.getSalary());
    }

}

class Salary{
    private int salary;

    void setSalary(int a){
        salary = a;
    }

    public int getSalary(){
        return salary;
    }
}



