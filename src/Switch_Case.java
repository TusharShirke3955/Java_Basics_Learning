import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Color Name ");
        String color = sc.next();

        switch (color){
            case "White":
                System.out.println("White Color");
                break;

            case "Black":
                System.out.println("Black Color");
                break;

            case "Blue":
                System.out.println("Blue Color");
                break;

            case "Brown":
                System.out.println("Brown Color");
                break;

            default:
                System.out.println("Color not Defined");
        }

        switch (color) {
            case "White" -> System.out.println("Second Switch Case - White Color");
            case "Black" -> System.out.println("Second Switch Case - Black Color");
            case "Blue" -> System.out.println("Second Switch Case - Blue Color");
            case "Brown" -> System.out.println("Second Switch Case - Brown Color");
            default -> System.out.println("Second Switch Case - Color not Defined");
        }
    }
}
