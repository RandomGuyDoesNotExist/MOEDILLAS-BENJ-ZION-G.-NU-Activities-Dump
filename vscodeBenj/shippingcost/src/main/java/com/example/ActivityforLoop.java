package com.example;
import java.util.Scanner;
public class ActivityforLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println(" ");
        double[] array1 = new double[5]; 
        String[] array2 = {"Math", "Science","English","History","Programming"} ; 

        System.out.println("Enter the array elements/ grades: ");
        // int arrayinput = scan.nextInt();

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + ":");
            array1[i] = scan.nextDouble(); 
        }
        System.out.println(" ");
        System.out.println("=== SUBJECT AND GRADES ===");
        System.out.println(" ");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] +" : "+array1[i]);
        }
        double sumofgrades = 0.0;

        for (int i = 0; i < array1.length; i++) {
            sumofgrades += array1[i];
        }

        double mean = sumofgrades / array1.length ; 
        System.out.println(" ");
        System.out.println("The average is: " + mean);


        /* 
        System.out.println(" ");
        System.out.println("SUBJECT AND GRADES");
        System.out.println(array2[0] + " : " + array1[0] );
        System.out.println(array2[1] + " : " + array1[1]);
        System.out.println(array2[2] + " : " + array1[2] );
        System.out.println(array2[3] + " : " + array1[3] );
        System.out.println(array2[4] + " : " + array1[4] );
        */

    }
}
