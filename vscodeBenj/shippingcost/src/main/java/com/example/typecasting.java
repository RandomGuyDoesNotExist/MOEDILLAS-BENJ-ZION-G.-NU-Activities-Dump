// BENJ ZION G. MOEDILLAS    ITE - 104 -- DONT DELETE OR EDIT FILE 
// TYPECASTING // UWU // 
package com.example;
import java.util.Scanner; 
public class typecasting {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("ENTER SOMETHING: ");
        String userinput = scan.nextLine();
        int input1 = Integer.parseInt(userinput);
    System.out.println("ENTER ANOTHER: ");
        String userinput2 = scan.nextLine();
        int input2 = Integer.parseInt(userinput2);

       int  userinputTotal = input1 + input2;

System.out.printf("Total for the Input: %d", userinputTotal);


/* 
//NOTES BELOW FOR TYPE CASTING -- 26/09/2024 
    String numberStr = "123";
    String numberStr2 = "456";

// translate STRING INTO AN INT 
     int number = Integer.parseInt(numberStr);
     int number2 = Integer.parseInt(numberStr2 );
     
// Integer.parseInt(*string variable name that you want to convert*) - syntax for converting a string into an int 

     int total = number + number2;

     System.out.printf("String Value: %s\n",numberStr);
     System.out.printf("Integer Value: %d\n", number);
        
     System.out.printf("String Value 2: %s\n",numberStr2);
     System.out.printf("Integer Value 2 : %d\n", number2);

     System.out.printf("Total of the two values are: %d",total);
*/
// THIS NEXT BLOCK OF CODE UTILIZES THE USE FOR MATH.MIN AND MATH.MAX. .min is for the lowest, .max is for the highest value. 
/* Scanner scan = new Scanner(System.in);
System.out.print("Enter character 1: ");
char input1 = scan.next().charAt(0);

System.out.print("Enter character 2: ");
char input2 = scan.next().charAt(0);


//char lowestcharacter = (char)Math.min(input1, input2);

System.out.printf("The lesser character is: %c",(char)Math.min(input1, input2));

*/

    }
}
