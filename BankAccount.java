/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic;

/**
 *
 * @author Nujhath
 */
public class BankAccount {
    int accountNumber;
    int balance;
   BankAccount(int an,int b)
   {
       accountNumber = an;
       balance = b;
   }
   BankAccount()
   {
       System.out.println("No info!"); 
   }
   void display()
   {
       System.out.println("Account number: "+accountNumber);
       System.out.println("Initial balance: "+balance);
       
   }
    
}

