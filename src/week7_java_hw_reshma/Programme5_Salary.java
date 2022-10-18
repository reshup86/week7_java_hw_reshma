package week7_java_hw_reshma;

import java.util.Scanner;

public class Programme5_Salary {
    public static void main(String[] args) {
        Programme5_Salary programme5 = new Programme5_Salary();
        programme5.salary();
    }
    public void salary(){
        int hra,ta,da,pf,gs;

        Scanner s = new Scanner(System.in);
        System.out.print("Employee Id: ");
        int id = s.nextInt();
        System.out.print("\nEmployee name: ");
        String ename=s.next();
        System.out.print("\nEnter basic salary: ");
        int sal=s.nextInt();

        hra = (sal*10)/100;
        ta= (sal*9)/100;
        da=(sal*8)/100;
        pf=(sal*20)/100;
        gs=sal+hra+da+ta-pf;
        System.out.println("_________________________");
        System.out.println("|      Salary Slip       |");
        System.out.println("|________________________|");
        System.out.println("|Employee ID:   "+id+"       |");
        System.out.println("|Employee Name: "+ename+"    |");
        System.out.println("|________________________|");
        System.out.println("Basic salary: "+sal+"      |");
        System.out.println("HRA 10%:      "+hra+"        |");
        System.out.println("TA 8%:        "+ta+"        |");
        System.out.println("DA 9%:        "+da+"        |");
        System.out.println("PF -20%:      "+pf+"        |");
        System.out.println("|_________________________|");
        System.out.println("|Gross Salary:" +gs+"       |");
        System.out.println("|_________________________|");
        s.close();
    }
}
