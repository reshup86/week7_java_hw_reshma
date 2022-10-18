//Write a java program to input any number and find out if it’s odd or even by using if else statement

package week7_java_hw_reshma;

import java.util.Scanner;
public class Programme6_OddEvenNumber {
    public static void main(String[] args) {
        Programme6_OddEvenNumber programme6 = new Programme6_OddEvenNumber();
        programme6.oddevn();
    }
    public void oddevn(){
        Scanner s = new Scanner(System.in);
        System.out.print("Input number value: ");
        int num = s.nextInt();
        if(num %2==0){
            System.out.println(num +" number is even number");
        }else {
            System.out.println(num + " number is odd number");
        }
        s.close();
    }
}
