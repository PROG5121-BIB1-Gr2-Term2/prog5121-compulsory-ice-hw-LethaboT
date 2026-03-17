/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmarks;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class StudentMarks {

    public static void main(String[] args) {
       
        //Scanner input
        Scanner myScanner=new Scanner(System.in);
        
       //Declarations
       int pass=0;
       int fail=0;
       
       for (int i=1; i<=5 ;i++);
       
       //Ask user for marks
     System.out.print("Enter your marks: ");
     int mark= myScanner.nextInt();
     
     if(mark>=00 && mark <=49)
         System.out.print("Fail");
           fail++ ;
    
     else if (mark>= 50 && mark<=74)
         System.out.print("Pass");
           pass++ ;
             
     else if(mark>=75 && mark <=100)
         System.out.print("Distinction");
          pass++ ;
              
     System.out.print("\nTotal Pass: " + pass);
     System.out.print("\nTotal Fail: "+ fail);
     
     
     
       
       
               
    }
}
