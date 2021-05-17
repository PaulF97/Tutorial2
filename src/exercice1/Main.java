/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author fishe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        double monthDeposit =0;
        double monthwithdray =0;
        double interestEarned =0;
        double totalDeposit =0;
        double totalWithdray =0;
        
        Scanner saving = new Scanner(System.in);
        
        System.out.println("Enter the number of months");
        int months = saving.nextInt();
        
        System.out.println("Enter the interest rate in %");
        double interest = saving.nextInt();
        
        System.out.println("Enter the starting balance");
        double balance = saving.nextInt();
        
        SavingsAccount test = new SavingsAccount(interest, balance);
        
        for(int i =0; i < months; i++){
        
            // calcul deposit par mois
            System.out.print("Enter amount deposited for month: " + i + ": ");
            monthDeposit = saving.nextDouble();
            totalDeposit += monthDeposit;
            
            test.deposit(monthDeposit);
            
            System.out.print("Enter amount withdrawn for " + i + ": ");
            monthwithdray = saving.nextDouble();
            totalWithdray += monthwithdray;
            
            test.withDraw(monthwithdray);
            
            // add the interest
            test.getAnnualInterest();
            
            interestEarned += test.getLastAmount(); // calculat the interest earned
            
            DecimalFormat dollar = new DecimalFormat("#,##0.00");

            // Display the totals and the balance.
            System.out.println(" deposited: " + dollar.format(totalDeposit));
            System.out.println(" withdrawn: " + dollar.format(totalWithdray));
            System.out.println(" earned: " + dollar.format(interestEarned));
            System.out.println(" balance: "
            + dollar.format(test.getBalance()));
        }
    }
    
}
