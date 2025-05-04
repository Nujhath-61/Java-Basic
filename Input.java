/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author Nujhath
 */
public class Input {
    public static void main (String[] args)
    {
        Scanner input  = new Scanner(System.in);//declaring a variable name 'input' 
        int num;
        System.out.print("Enter any number:");
        num = input.nextInt();
        input.nextLine();//consumes newline otherwise remaining part wont work properly
       
        System.out.println("Number : "+num);
        String name;
         System.out.print("Enter a name: ");
         name = input.next();//used to take input. next() skips anything after a space
          input.nextLine();
               
             System.out.println("Name : "+name);
    System.out.print("Enter another name:");
             String name1;
               name1 = input.nextLine();
            System.out.println("Name : "+name1);
            
           
           
    }
}
