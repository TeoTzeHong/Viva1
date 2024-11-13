/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaq6;

import java.util.Scanner;
public class VIVAQ6 {

    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        int score;
        int largest,secondlargest;
        int frequencylargest=0, frequencysecondlargest=0;
        boolean isnegative=false;
        int sum=0;
        System.out.print("Enter numbers: ");
        score=sc.nextInt();
        largest = Integer.MIN_VALUE;
        secondlargest = Integer.MIN_VALUE;
        int finallargest = largest;
        int finalsecondlargest = secondlargest;
        while(score!=0)
        {
           
            if(score>largest)
            {
                secondlargest = largest;
                frequencysecondlargest = frequencylargest;
                largest = score;
                frequencylargest=0;
            }
            
            else if (score>secondlargest)
            {               
                if(score != largest) {                   
                      secondlargest = score;
                      frequencysecondlargest=0;
                }
            }

            if(score==largest)
            {
                frequencylargest++;
            }
            if(score==secondlargest)
            {
                frequencysecondlargest++;
            }
            
            sum +=score;
       
            if(score<0)
                isnegative = true;
            score=sc.nextInt();
            
        
        }
        
        if(largest!=finallargest)
        {
            System.out.println("The largest number is "+largest);
            System.out.println("The occurrence count of the largest number is "+frequencylargest);
        }
        else
        {
            System.out.println("There is no largest number.");
            System.out.println("There is no occurrence count of the largest number");
        }
        
        if(secondlargest != finalsecondlargest)
        {
            System.out.println("The second-largest number is "+secondlargest);
            System.out.println("The occurrence count of the second-largest number is "+frequencysecondlargest);
        }
        else
        {
            System.out.println("There is no second-largest number.");
            System.out.println("There is no occurrence count of the second-largest number");
        }
       
        System.out.println("The total sum of all numbers is "+sum);
        if(isnegative==true)
            System.out.println("Negative numbers were entered.");
        else
            System.out.println("No negative numbers were entered.");
    }
    
}
