//1.1 Write a program to display any message:
//1.5 To get the name using the command line.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("This is a program to display any message");
        System.out.println("Enter You Name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Your Name is: "+str);
    }
}