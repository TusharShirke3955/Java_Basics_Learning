package test;

class bank{
    int getrate(){
        return 5;
    }
}

class SBI extends bank{
    int getrate(){
        System.out.println("SBI Interest Rate");
        return 10;
    }
}

class BOB extends bank{
    int getrate(){
        System.out.println("BOB Interest Rate");
        System.out.println(super.getrate());
        return 15;
    }
}

class ICICI extends bank{
    int getrate(){
        System.out.println("ICICI Interest Rate");
        return 20;
    }
}

public class Polymorphism_Java {
    public static void main(String[] args){
        bank i = new ICICI();
        bank s = new SBI();
        bank b = new BOB();
        SBI sb = new SBI();
        ICICI ic = new ICICI();

        System.out.println(s.getrate());
        System.out.println(b.getrate());
        System.out.println(i.getrate());
        System.out.println(sb.getrate());
        System.out.println(ic.getrate());

    }
}