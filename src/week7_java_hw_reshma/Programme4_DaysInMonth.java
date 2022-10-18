package week7_java_hw_reshma;

public class Programme4_DaysInMonth {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        System.out.print("\n"+getDaysInMonth(1, 2020)+", ");
        System.out.print("\n"+ getDaysInMonth(2, 2020)+", ");
        System.out.print("\n"+ getDaysInMonth(2, 2018)+", ");
        System.out.print("\n"+ getDaysInMonth(-1, 2020)+", entered month is invalid");
        System.out.print("\n"+ getDaysInMonth(1, -2020)+", entered year is not in range");
    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            System.out.println(year + " is not a leap year");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is a not leap year");
            return false;
        }

    }

    public static int getDaysInMonth(int m, int y) {
        if ((m < 1 || m > 12) && (y < 1 || y > 9999)) {
            return -1;
        }
        switch (m){
            case 1:
                case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(y)? 28:29;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}