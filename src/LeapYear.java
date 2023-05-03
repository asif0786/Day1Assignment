//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int n = sc.nextInt();
        if(n%4 == 0) {
            if(n%100 == 0){
                if(n%400 == 0){
                    System.out.print("It is a leap year");
                }else{
                    System.out.print("Not a leap year");
                }
            }else{
                System.out.print("It is a leap year. It has 366days");
            }
        }else{
            System.out.print("Not a leap year. It has 365days");
        }
    }
}
