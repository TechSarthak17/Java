import java.util.Scanner;
 
public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grade = sc.nextFloat();
        if( grade > 0.00 && grade <= 100){

        
            if (grade >= 90) {
              System.out.println("A");
            } else if (grade >= 80) {
              System.out.println("B");
            } else if (grade >= 70) {
              System.out.println("C");
            } else if (grade >= 60) {
              System.out.println("D");
            } else {
                 System.out.println("F");
         }
        }
    else{
            System.out.println("Invalid input niggaa !!!!!!!!");
    }
        sc.close();
    }
}