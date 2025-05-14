/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

import java.util.Scanner;

public class AreaofCircle {
    public static void main (String[] args)
    {
       double radius,area;
        Scanner  input = new Scanner (System.in);
        System.out.print("Enter Radius Of the Circle: ");
       radius = input.nextDouble();
        area = 3.1416 * radius  *radius;
        System.out.println("Area of the circle is : "+area);
       
        
    }
}
