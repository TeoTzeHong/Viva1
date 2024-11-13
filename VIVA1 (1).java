/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class VIVA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
        
        //Prompt user to enter a number and initialize sum to 0
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        
        while (num<=0){
            System.out.println("The number entered should be more than 0");
            System.out.print("Enter a number:");
            num=sc.nextInt();}
        
    int sum=0;
        
//Loop continue until number reduced to a single digit 

while (sum>9 || sum == 0){
    sum=0;
    for(;num!=0;){
        sum+=num%10;
        num/=10;
    }
    num=sum;
}
System.out.println("Sum of digits until single digit:"+sum);
    }
}

            
        
            
            
            
       