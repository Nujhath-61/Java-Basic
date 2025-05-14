/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Nujhath
 * 
 */
public class Palindorme {
    public static void main (String [] args)
    {
        System.out.print("Enter a number:");
        int n;
        Scanner input = new Scanner (System.in);
        n = input.nextInt();
        int original = n;
        int rev = 0 ,rem;
        while( n != 0)
        {
           rem = n % 10;
           rev =  rev*10 + rem;
           n/=10;
        }
        if( original == rev)
        {
            System.out.println(original + " is  a palindrome number");
        }
        else
        {
            System.out.println(original + " is not a palindrome number");
        }
    }
    
}
