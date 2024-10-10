package com.example;

public class ActivityMd01 {
    public static void main(String[] args) {
     
        char[][] array2d = new char [3][4];
        //array2d = { }
        for (int rows = 0; rows < array2d.length; rows++) {
            for (int column = 0; column < array2d.length; column++) {
                array2d[rows][column] = '*';
            }
        }

        for (int rows = 0; rows < array2d.length; rows++) {
            for (int column = 0; column < array2d[rows].length; column++) {
               System.out.println(array2d[rows][column]);
            }
        }

             System.out.println();








    }
}
