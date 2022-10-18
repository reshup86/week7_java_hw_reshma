//Write a Java program to sort a numeric array and a string array.
package week7_java_hw_reshma;

import java.util.Arrays;
public class Programme17_NumStrngArray {
    public static void main(String[] args) {
        Programme17_NumStrngArray programme17 = new Programme17_NumStrngArray();
        programme17.sort();
    }
    public void sort(){
          int a1[] = {19,2500,38,1850,362,1645,67,528,2,1723};
          String []a2 = {"butter","yougurt","flour","cocoa","salt","thyme","oregano","apple","lime","pancake"};

        System.out.println("Entered number array: "+Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println("Entered number in sequence:" +Arrays.toString(a1));

        System.out.println("Entered string array in: " +Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println("Entered string in sequence is: " +Arrays.toString(a2));
    }
}