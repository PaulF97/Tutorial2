/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

import java.util.Scanner;


/**
 *
 * @author fishe
 */
public class MainBilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner saving = new Scanner(System.in);
        
        System.out.println("enter the price of the book");
        double priceEntered = saving.nextDouble();
        
        System.out.println("enter the quantity ");
        int quantity = saving.nextInt();
        
        System.out.println("enter the coupon ");
        double coupon = saving.nextDouble();
        
        Billing test1 = new Billing(priceEntered, quantity, coupon);
        
        test1.computeBilling(priceEntered);
        test1.computeBilling(priceEntered, quantity);
        test1.computeBilling(priceEntered, quantity, coupon);
        
        System.out.println(" function tests  " + test1);
    }
}
