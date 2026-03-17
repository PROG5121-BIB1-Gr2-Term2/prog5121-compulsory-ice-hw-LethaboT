/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salescommission;

/**
 *
 * @author ASUS
 */ import java.util.Scanner;
public class SalesCommission {

    public static void main(String[] args) {
       
        Scanner myInput=new Scanner(System.in);
        
        //Declarations
        double sales;
        double commission;
        
        while(true)
         System.out.print("Enter sales amount: ");
           sales= myInput.nextDouble();
         
         if (sales==-1)
             System.out.print("Program ended");
        
         
         else if(sales <5000 && sales <=9999)
        commission = sales *0.10;
         
         else
             commission= sales* 0.15;
         
         System.out.println("Commission =R " + commission);
    }
}
