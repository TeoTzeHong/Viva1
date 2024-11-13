/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivaq2;
import java.util.Scanner;
/**
 *
 * @author cyq27
 */
public class vivaq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n, a, b: ");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        
        if (n < 1 || n > 1000000000) {
            System.out.println("The value of n must be between 1 and 10^9");
            return;
        }
        
        if (a < 1 || a > n) {
            System.out.println("The value of a must be between 1 and " + n );
            return;
        }
        
        if (b < 2 || b > 100000) {
            System.out.println("The value of b must be between 2 and 10^5");
            return;
        }
        
        
        
        int steps = 0;
        
        while (n > 1) {
            if (n % b == 0) {
                n /= b;
            }
            else {
                n -= a;
            }
            steps++;

            if (n < 1) {
                steps = -1;
                break;
            }
        }
        
        
        System.out.println("Total steps: " + steps);
    }
}
