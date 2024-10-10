package com.example;

import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String cname = scan.nextLine();
        
        System.out.print("Enter Customer Address: ");
        String caddress = scan.nextLine();

        System.out.print("Enter Contact No: ");
        String cnum = scan.nextLine();
            
        System.out.print("Enter your location type (Local, Regional, International): ");
        String location = scan.nextLine();

        System.out.print("Enter your order weight in kg: ");
        double weight = scan.nextDouble();
            scan.nextLine();

            double shippingtotal = 0.0;
            
        switch (location.toLowerCase()){
            case "local":
            if(weight >= 5){
                shippingtotal = 100.00;
                break;
            } 
            else if( weight < 5) {
                shippingtotal = 0.0;
                break;
            }
            case "regional":
                if((weight> 5) && (weight< 20)){
                    shippingtotal = 200.00;    
                    break;        
                }
                else if (weight>20){
                    shippingtotal = 300.00;
                    break;
                }
                else if (weight<5) {
                    shippingtotal = 150.00;
                    break;
                }
                case "international": shippingtotal = 500.00;
                break;
        }
        



        System.out.printf("Customer Name: %s\n",cname);
        System.out.printf("Customer Address: %s\n",caddress);
        System.out.printf("Customer No: %s\n",cnum);
        System.out.println(" ");
        System.out.printf("Order Weight: %.1f kg\n",weight);
        System.out.printf("Shipping Cost: %.2f", shippingtotal);
    }
}