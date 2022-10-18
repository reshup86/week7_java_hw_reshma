package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme7_Sales {
    public static void main(String[] args) {
        Programme7_Sales programme7 = new Programme7_Sales();
        programme7.sales();
    }
    public void sales(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int eID = s.nextInt();
        System.out.print("\nEnter Employee name: ");
        String eName = s.next();
        System.out.print("\nEnter amount: ");
        int amt= s.nextInt();
        System.out.print("\nEnter basic salary: ");
        int sal=s.nextInt();

        int c=0;
        if (amt>=50000){
            c = (amt*35)/100;
        }else if (amt>=30000){
            c= (amt*20)/100;
        }else if (amt>=20000){
            c=(amt*10)/100;
        }else if (amt>=10000){
            c=(amt*5)/100;
        }else {
            c=(amt*2)/100;
        }
        System.out.print("\nCommision is: " +c);
        s.close();
    }
}

