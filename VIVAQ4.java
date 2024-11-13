/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vivaq4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class VIVAQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0;
        boolean pizzaOrder = false, drinksOrder = false, dessertOrder = false;
        
        while(true){ 
            System.out.println("Welcome to Maroni's Pizza! ");
            System.out.println("1. Pizza");
            System.out.println("2. Drinks");
            System.out.println("3. Dessert");
            System.out.println("4. CHECKOUT");
            System.out.println();
            System.out.print("Pick an option: ");
            
            int option = sc.nextInt();
            
            if(option == 1){
                
                while(true){
                    System.out.println();
                    System.out.println("PIZZA");
                    System.out.println("1 Chicken Peperoni - RM15");
                    System.out.println("2 Chicken Supreme - RM18");
                    System.out.println("3 Vegan Indulgence - RM12");
                    System.out.println("4 Beef Delight - RM22");
                    System.out.println("5 Margherita - RM9");
                    System.out.println("6 BACK TO MAIN MENU");
                    System.out.println();
                    System.out.print("Pick an option: ");
                    
                    int choice = sc.nextInt();
                    
                    if(choice == 1){
                        total += 15;
                        System.out.println("Added Chicken Peperoni");
                        System.out.printf("Current total : RM%.1f\n", total);
                        pizzaOrder = true;
                    }
                    else if(choice == 2){
                        total += 18;
                        System.out.println("Added Chicken Supreme");
                        System.out.printf("Current total : RM%.1f\n", total);
                        pizzaOrder = true;
                    }
                    else if(choice == 3){
                        total += 12;
                        System.out.println("Added Vegan Indulgence");
                        System.out.printf("Current total : RM%.1f\n", total);
                        pizzaOrder = true;
                    }
                    else if(choice == 4){
                        total += 22;
                        System.out.println("Added Beef Delight");
                        System.out.printf("Current total : RM%.1f\n", total);
                        pizzaOrder = true;
                    }
                    else if(choice == 5){
                        total += 9;
                        System.out.println("Added Margherita");
                        System.out.printf("Current total : RM%.1f\n", total);
                        pizzaOrder = true;
                    }
                    else if(choice == 6){
                        break;
                    }
                    else{
                        System.out.println("Invalid option. Try again.");
                    }
                }
            }
            
            else if(option == 2){
                
                while(true){
                    System.out.println();
                    System.out.println("DRINKS");
                    System.out.println("1 Strawberry Smoothie - RM8");
                    System.out.println("2 Banana Smoothie - RM8");
                    System.out.println("3 Mocktail - RM12");
                    System.out.println("4 Soft Drink - RM5");
                    System.out.println("5 Mineral Water - RM3");
                    System.out.println("6 BACK TO MAIN MENU");
                    System.out.println();
                    System.out.print("Pick an option: ");
                    
                    int choice = sc.nextInt();
                    
                    if(choice == 1){
                        total += 8;
                        System.out.println("Added Strawberry Smoothie");
                        System.out.printf("Current total : RM%.1f\n", total);
                        drinksOrder = true;
                    }
                    else if(choice == 2){
                        total += 8;
                        System.out.println("Added Banana Smoothie");
                        System.out.printf("Current total : RM%.1f\n", total);
                        drinksOrder = true;
                    }
                    else if(choice == 3){
                        total += 12;
                        System.out.println("Added Mocktail");
                        System.out.printf("Current total : RM%.1f\n", total);
                        drinksOrder = true;
                    }
                    else if(choice == 4){
                        total += 5;
                        System.out.println("Added Soft Drink");
                        System.out.printf("Current total : RM%.1f\n", total);
                        drinksOrder = true;
                    }
                    else if(choice == 5){
                        total += 3;
                        System.out.println("Added Mineral Water");
                        System.out.printf("Current total : RM%.1f\n", total);
                        drinksOrder = true;
                    }
                    else if(choice == 6){
                        break;
                    }
                    else{
                        System.out.println("Invalid option. Try again.");
                    }
                }
            }
            
            else if(option == 3){
                
                while(true){
                    System.out.println();
                    System.out.println("DESSERT");
                    System.out.println("1 Tiramisu - RM7");
                    System.out.println("2 Strawberry Shortcake - RM10");
                    System.out.println("3 Green Jello - RM4");
                    System.out.println("4 Crème Brûlée - RM15");
                    System.out.println("5 Raspberry Pie - RM20");
                    System.out.println("6 BACK TO MAIN MENU");
                    System.out.println();
                    System.out.print("Pick an option: ");
                    
                    int choice = sc.nextInt();
                    
                    if(choice == 1){
                        total += 7;
                        System.out.println("Added Tiramisu");
                        System.out.printf("Current total : RM%.1f\n", total);
                        dessertOrder = true;
                    }
                    else if(choice == 2){
                        total += 10;
                        System.out.println("Added Strawberry Shortcake");
                        System.out.printf("Current total : RM%.1f\n", total);
                        dessertOrder = true;
                    }
                    else if(choice == 3){
                        total += 4;
                        System.out.println("Added Green Jello");
                        System.out.printf("Current total : RM%.1f\n", total);
                        dessertOrder = true;
                    }
                    else if(choice == 4){
                        total += 15;
                        System.out.println("Added Crème Brûlée");
                        System.out.printf("Current total : RM%.1f\n", total);
                        dessertOrder = true;
                    }
                    else if(choice == 5){
                        total += 20;
                        System.out.println("Added Raspberry Pie");
                        System.out.printf("Current total : RM%.1f\n", total);
                        dessertOrder = true;
                    }
                    else if(choice == 6){
                        break;
                    }
                    else{
                        System.out.println("Invalid option. Try again.");
                    }
                }
            }
            
            else if(option == 4){
                
                if(pizzaOrder && drinksOrder && dessertOrder){
                    System.out.println();
                    System.out.printf("Your total is RM%.1f!\n", total);
                    System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                    total *= 0.8;
                    System.out.printf("Your new total is RM%.1f!\n", total);
                    System.out.println();
                    System.out.println("Have a nice day!");
                    break;
                }
                else{
                    System.out.println();
                    System.out.printf("Your total is RM%.1f!\n", total);
                    System.out.println("Have a nice day!");
                    break;
                }
            }
        }
    }
}
