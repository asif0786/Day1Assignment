//1.3 Write a program to check two strings are equal or not.
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str1 = sc.next();
        System.out.print("Enter String 2 : ");
        String str2 = sc.next();
        if(str1.length() == str2.length()){
            System.out.println("Both Strings are Equal");
        } else if (str1.length() > str2.length()) {
            System.out.println("String 1 is Greater than String 2");
        }else {
            System.out.println("String 2 is Greater than String 1");

        }
    }
}
