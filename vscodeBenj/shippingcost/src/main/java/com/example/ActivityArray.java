package com.example;
import java.util.Scanner; 
public class ActivityArray {
     // This file is an iteration of instructions given by our professor, changes on element values, and names are to be expected
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Enter what index you would like to modify: ");
    int modifiedindex = scan.nextInt(); 
    System.out.println("Enter what value you would like to change it with: ");
    int modifiedvalue = scan.nextInt();
    System.out.println(" ");
    int[] array1 = { 10, 20, 30, 40, 50} ; 
    // This file is an iteration of instructions given by our professor, changes on element values, and names are to be expected
      
    System.out.println("INITIAL VALUE");
    System.out.println("Index 0: " +array1[0]);
    System.out.println("Index 1: " +array1[1]);

    // change the value or modify the value of an element by using the specific index beside the array variable
    //    array1[2] = 94; // usually, modifications should be placed before the print for it to update or the modifications to be seen 

    System.out.println("Index 2: " +array1[2]);
    System.out.println("Index 3: " +array1[3]);
    System.out.println("Index 4: " +array1[4]);

    System.out.println(" ");
    array1 [modifiedindex] = modifiedvalue; 
    System.out.println(" ");
    System.out.println("UPDATED VALUE");
    System.out.println("Index 0: " +array1[0]);
    System.out.println("Index 1: " +array1[1]);
    System.out.println("Index 2: " +array1[2]);
    System.out.println("Index 3: " +array1[3]);
    System.out.println("Index 4: " +array1[4]);

    int totalelements = 0; // this will be the holder for the value or sum of each value of element

    System.out.println("Total number of elements: "+ array1.length);

        for (int detector1 = 0; detector1 < array1.length; detector1++) { 
            totalelements += array1[detector1];
    }
    double mean = (double)totalelements / array1.length ; 

    System.out.println("The average or mean of elements is: " + mean);

    }
}
