package com.example;

public class ActivityMd02 {
    public static void main(String[] args) {
        char [][] array = new char[4][];

        for (int i = 0; i < array.length; i++) { // for the row
            array [i] = new char [i+1];  // row has i+1 column 
            for (int j = 0; j < array[i].length; j++) { // for the column
                array[i][j] = '*';
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
       /* // PRINT 2D ARRAY   
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                 System.out.print(array[i][j] + " ");
            }   
            System.out.println();           
}
*/

    }
}
