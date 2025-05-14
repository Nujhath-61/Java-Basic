/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

/**
 *
 * @author Nujhath
 */
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third;
          System.out.print(" "+first+" "+second);
        for(int i = 3;i<=25;i++)
        {
            third = first + second;
            System.out.print(" "+third);
           first = second;
           second = third;
        }
        
    }
    
}
