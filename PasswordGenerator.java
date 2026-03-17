/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passwordgenerator;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
         
public class PasswordGenerator {

    public static void main(String[] args) {
    //Declarations 
    String fullName;
    String lowerName;
   
//insert Scanner
     Scanner myScanner = new Scanner(System.in); 
      
      //Ask the user to enter full name
      System.out.print("Please enter your full name(First Last: ");
      fullName= myScanner.nextLine();
      
      //Convert name to lowercase 
      lowerName= fullName.toLowerCase();
      
      //Split first and Last name
      String[] name = lowerName.split(" ");
      String firstName= name[0];
      String lastName = name[1];
      
      //First letter of first name to uppercase
      String firstLetter = firstName.substring(0,1).toUpperCase();
      
      //Last 3 letters of last name
      String lastThree=lastName.substring(lastName.length)-3;
      
     //Replace 'a' with '@'
     String changedName=lowerName.replace("a","@");
     
     //Number of character excluding spaces
     int length =lowerName.replace(" ","").length(); 
     
     //Create secret code
     String password= firstLetter+ lastThree+ changedName+length; 
     
     //Output
     System.out.print("Password: "+ password);
   
      
      
      
    }
}
