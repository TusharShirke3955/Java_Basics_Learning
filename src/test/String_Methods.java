package test;
public class String_Methods {
    public static void main(String args[]){
        String s1 = "Automation Testing";
        String s2 = "Tushar shirke";
        String s3 = "Tushar";
        String s4 = "Tushar";
        String s5 = new String("Shirke");
        String s6 = new String("Shirke");

        if (s3.equals(s4)){
            System.out.println("== is correct");
            assert true;
        }else{
            System.out.println("== is not correct");
            assert false;
        }



//        String[] s3 = s2.split(",");
//        System.out.print(s3);
//        for (String s4 : s3){
//            System.out.println(s4);
//        }

//        System.out.println("Length of the String : " + s1.length());
//        System.out.println("Convert String in upper case : " + s1.toUpperCase());
//        System.out.println("Convert String in Lower Case : " + s1.toLowerCase());

//        int a = 10;
//        if (a > 5){
//            System.out.println("If Excecuted");
//        }
//        else {
//            System.out.println("Else Excecuted");
//        }
    }
}