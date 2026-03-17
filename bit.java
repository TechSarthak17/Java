import java.util.Scanner;

public class bit {


    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("You entered: " + age);
        sc.close();
    }
}