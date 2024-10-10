
package com.example;
import java.util.Scanner;
public class BenjMachineProblem2Typecasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Eggs(30.00), 2.Milk(50.00)");
        System.out.println("Enter your product choice: ");
        int input1 = scan.nextInt();

        System.out.println("Enter the quantity: ");
        int quan = scan.nextInt();

        // PRICES CONTAINED IN DOUBLE
        double eggs = 30.00;
        double milk = 50.00;
        

        switch (input1) {
            case 1:
            double total = quan * eggs; 
            System.out.printf("The total is: %.2f pesos", total);
                break;
            case 2:
            double newtotal = quan * milk;
            System.out.printf("The total is: %.2f pesos", newtotal );
            break;
            default: System.out.println("Pick only between Product 1 and Product 2");
                break;
        }
       

    }
    
}
