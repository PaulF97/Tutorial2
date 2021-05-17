/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice3;

import java.util.Scanner;


/**
 *
 * @author fishe
 */
public class MainRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter the contract number");
        double contrat = keyboard.nextDouble();
        
        System.out.println("enter the number of minuts");
        long time = keyboard.nextLong();
        
        Rental test = new Rental(contrat, time);
        
        test.calculatPrice();
        
        System.out.println(test);
    }
    
}
