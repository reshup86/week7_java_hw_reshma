package week7_java_hw_reshma;

import java.util.Objects;
import java.util.Scanner;

public class Programme8_AtoFCity {
    public static void main(String[] args) {
        Programme8_AtoFCity programme8 = new Programme8_AtoFCity();
        programme8.city();
    }
    public void city(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any alphabet from A to F: ");
        String x = s.nextLine();
        if (((Objects.equals(x,"A")||(Objects.equals(x,"a"))))){
            System.out.println("Aberdeen");
        } else if (((Objects.equals(x,"B")||(Objects.equals(x,"b"))))){
            System.out.println("Birmingham");
        } else if (((Objects.equals(x,"C")||(Objects.equals(x,"c"))))){
            System.out.println("Cardiff");
        } else if (((Objects.equals(x,"D")||(Objects.equals(x,"d"))))){
            System.out.println("Derby");
        } else if (((Objects.equals(x,"E")||(Objects.equals(x,"e"))))){
            System.out.println("Edinburgh");
        }else if (((Objects.equals(x,"F")||(Objects.equals(x,"f"))))){
            System.out.println("France");
        }else {
            System.out.println("Please enter valid alphabet from A to F");
        }
        s.close();
        }
    }
