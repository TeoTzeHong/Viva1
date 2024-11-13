/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

import java.util.Scanner;
public class VivaQ3 {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
      int factorsCounter =0;
      int sumOfFactor=0;
      int productOfFactor=1;
      int total= 0;
      int isPrime=0;
      int MAX =Integer.MAX_VALUE;
      boolean overflow=false;
    
      System.out.print("Enter an integer greater than 1 : ");
      int num=scanner.nextInt();     //prompt the user to enter an integer
       
           
    do  { 
       if(num<1 )
          {  
        System.out.println("Invalid input please enter again an integer greater than 1");
        System.out.print("Enter an integer greater than 1 :");
        num=scanner.nextInt(); 
          }
        }
    while(num<1 );        //if enter invalid number ,prompted to enter until they enter valid number
   
       for (int i =1; i<=num;i++)  //prime check
       {  
        if (num%i==0)
        isPrime++;
       }
       
       if (isPrime==2)
          System.out.print(num+" is a prime number,  ");
       else 
          System.out.print(num+ " is not a prime number, ");
       
        for(int i=1;i<=num;i++)    //counting factors
           if (num%i==0)
              {factorsCounter++;}
        System.out.println("it has "+factorsCounter+" factors");
        
        System.out.print("The factors of this integer are : ");
           for (int i=1;i<=num;i++) //calculating sum and product
             {      
                if (num%i!=0)
                {
                  continue;
                }
                    
                 sumOfFactor+=i;
                 
                 if (productOfFactor<=MAX/i) 
                     productOfFactor*=i;
                 else 
                     overflow=true;
              
                 
                System.out.print(i);
                if (i<num)
                    System.out.print(", ");
              }
                
                System.out.println("\nThe sum of the factors is "+sumOfFactor);
                
                
                if (overflow)
                    System.out.println("The product of factors is too large to display ");
                else 
                    System.out.println("The product of the factor is "+productOfFactor);
                
                
                for (int i=1;i<num;i++)      //perfect number check 
                {       
                    if(num%i!=0)
                        {
                         continue;
                        } 
                    total +=i;
                }
                
                if (total==num)
                    System.out.println(num+" is a perfect number.");
                else 
                    System.out.println(num+" is not a perfect number.");
                
                System.out.print("Prime numbers between 2 and "+num+" : "); //listung prime number
                
                
                for (int prime =2;prime<num;prime++)  { 
                   int newisPrime=0;    
                for (int i =1; i<=num;i++) 
                {  
                    if (prime%i==0)
                        newisPrime++;
                }
      
                    if (newisPrime == 2 ) {
                        if (prime == 2) 
                        {
                       System.out.print(prime);
                        }
                    else {
                       System.out.print(", " + prime);
                         }
                                          }
      
                                }
                       System.out.println("");
            
       }
        
               }
    