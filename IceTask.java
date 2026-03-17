/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electricitybill;

/**
 *
 * @author ASUS
 */import java.util.Scanner; 

public class IceTask {
    public static void main(String[] args)  {
        
    //Question 1
    //Declarations
    String drink;
    double price;
    double change=0; 
    
   //Welcome message to the machine 
   System.out.print("Welcome to Drinks Vending Machine.");
   
     //Scanner input
     Scanner myScanner=new Scanner(System.in);
     
     //Prompt the user to enter information
     System.out.print("Select 1 to choose Coke");
     System.out.print("Select 2 to choose Water");
     System.out.print("Select 3 to choose Juice");
     System.out.print("Select 4 to choose Coffee");
     
     int choice= myScanner.nextInt();
     //Ask money inserted
     System.out.print("Please enter the ammount you inserted:R ");
     double moneyInserted= myScanner.nextDouble();
     
     
     switch(choice){
         case 1:
             drink= "Coke";
              price=12;
                     break;
                     
         case 2:
            drink= "Water";
              price=8;
                     break; 
                     
         case 3:
             drink= "Juice";
              price=15;
                     break;
               
         case 4:
             drink= "Coffee";
             price=10;
                     break;
         default:
         System.out.print("Invalid choice!!");
            return;          
     }
     
     //Display choice of drink and price
     System.out.print("You have selected: " + drink);
     System.out.print("Price:R "+ price);
     
     //Calculating change 
     if(moneyInserted>price)
     change= moneyInserted-price;
      System.out.println("Your change is:R "+ change);
    
      else if(moneyInserted == price)
       System.out.println("Successful Payment.Thank you!");
              
      else 
         System.out.println("ERROR: Insufficient amount" ); 
              }
       
       
       
       
       
    
      
     
     
        
       
        
    
        
    }

     


