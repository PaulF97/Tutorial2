/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

/**
 *
 * @author fishe
 */
public class SavingsAccount {
    
    private double annualInterest;
    private double balance;
    private double lastAmount;
    
    // constructor
    public SavingsAccount(double annualInterest, double balance){
        this.annualInterest = annualInterest;
        this.balance = balance;

    }
    
    // Getter
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterest(){
        return annualInterest;
    }
    
    
    public double getLastAmount(){
        return lastAmount;
    }
    
    
    public void withDraw(double amount){
       balance -= amount;       
    }
    
    public void deposit(double deposit){
        balance -= deposit;
    }

    // calculs des taux d'intéret
    public void interestCalcul(){
        double monthInterestrate = annualInterest/12;
        
        lastAmount = monthInterestrate * balance;
         
        balance += lastAmount;
    }
    
    // affichage
    @Override
    public String toString(){
        String str = "ending balance " + balance + "amount deposit " + lastAmount;
        return str;
    }
}

