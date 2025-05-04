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
public class AreaOfTrinagle {
public static void main (String[] args)
{
     Scanner input = new Scanner(System.in);
   double base,height,area;
   System.out.print("Enter Base and Height Of the Triangle: ");
  
   base = input.nextDouble();
   height = input.nextDouble();
   input.nextLine();
   area = 0.5 * base * height;
   System.out.print("Area of triangle: "+area);
   
   
}
}
