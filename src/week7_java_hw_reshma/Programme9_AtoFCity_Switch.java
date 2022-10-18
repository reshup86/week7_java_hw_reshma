package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme9_AtoFCity_Switch {
    public static void main(String[] args) {
        Programme9_AtoFCity_Switch programme9 = new Programme9_AtoFCity_Switch();
        programme9.city();
    }
    public void city(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter alphabet from A to F: ");
        String x = s.nextLine();

        switch (x){
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Baroda");
                break;
            case "c":
                System.out.println("Chandigadh");
                break;
            case "d":
                System.out.println("Dehradun");
                break;
            case "e":
                System.out.println("Ellora");
                break;
            case "f":
                System.out.println("Fatehgarh");
                break;
            default:
                System.out.println("Please enter valid alphabet from A to F");
        }
        s.close();
    }
}
