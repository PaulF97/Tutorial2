/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice5;

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
        
        Scanner keyboard = new Scanner(System.in);
        
        // enter of information
        
        
        // description
        System.out.println("Write the description of the first item");
        String description1 = keyboard.next();
        
        System.out.println("Write the description of the second item");
        String description2 = keyboard.next();
        
        System.out.println("Write the description of the third item");
        String description3 = keyboard.next();
        
        // units
        System.out.println("Write the units of the first item");
        int units1 = keyboard.nextInt();
        
        System.out.println("Write the units of the second item");
        int units2 = keyboard.nextInt();
        
        System.out.println("Write the units of the third item");
        int units3 = keyboard.nextInt();
        
        
        // price
        System.out.println("Write the price of the first item");
        double price1 = keyboard.nextDouble();
        
        System.out.println("Write the price of the second item");
        double price2 = keyboard.nextDouble();
        
        System.out.println("Write the price of the third item");
        double price3 = keyboard.nextDouble();
        
        
        // objects of RetailItems class
        RetailItems item1 = new RetailItems(description1, units1, price1);
        RetailItems item2 = new RetailItems(description2, units2, price2);
        RetailItems item3 = new RetailItems(description3, units3, price3);
        
        CashRegister test1 = new CashRegister(item1,units1);
        CashRegister test2 = new CashRegister(item2,units2);
        CashRegister test3 = new CashRegister(item3,units3);
        
        test1.getSubtotal(price1);
        test2.getSubtotal(price2);
        test3.getSubtotal(price3);
        
        test1.getTaxe();
        test2.getTaxe();
        test3.getTaxe();  
        
        test1.getTotal();
        test2.getTotal();
        test3.getTotal();
        
        System.out.println("item #1 " + description1 + " information price " + test1);
        System.out.println("item #2 " + description2 + " information price " + test2);
        System.out.println("item #3 " + description3 + " information price " + test3);
        
        keyboard.close();
        
    }
    
}
