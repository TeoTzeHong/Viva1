/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaq5;
import java.util.Scanner;
public class VIVAQ5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String remix;
        String result;
        boolean iscorrect=true;
        System.out.println("Enter the remix: ");
        remix=sc.nextLine();
        for(int i=0;i<remix.length();i++)
        {
            
            if(remix.charAt(i)>='A'&& remix.charAt(i)<='Z')
                iscorrect=true;
            else
                iscorrect=false;
        }
            
        while(remix.length()>200 || iscorrect == false )
        {
            System.out.println("The string entered should follow the conditions:");
            System.out.println("1.The string entered should not more than 200 words.");
            System.out.println("2.The string entered should be all uppercase.");
            System.out.println("3.The string entered should have at least 1 word.");
            System.out.println("Enter the remix: ");
            remix=sc.nextLine();
            
            for(int i=0;i<remix.length();i++)
        {
            
            if(remix.charAt(i)>='A'&& remix.charAt(i)<='Z')
                iscorrect=true;
            else
                iscorrect=false;
        }
        }
        if(remix.contains("REMIX"))
        {
            result=remix.replaceAll("REMIX", " ");
            while(true)
            {
                result=result.replaceAll("  ", " ");
                if(result.replaceAll("  ", " ").equals(result))
                {
                    break;
                }
            }
            System.out.println(result.trim());
            
        }
        else
            System.out.println("There is no REMIX words in the statement.");
    }
    
}
