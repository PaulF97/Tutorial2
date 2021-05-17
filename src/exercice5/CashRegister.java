/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice5;

/**
 *
 * @author fishe
 */

public class CashRegister{
    
    private RetailItems obj;
    private int quantity;
    private double subtotal;
    private double tax;
    private double total;
    
    CashRegister(RetailItems obj, int quantity){
        this.obj = obj;
        this.quantity = quantity;
    }
    
    public double getSubtotal(double price){
        
        subtotal = quantity * price;
        return subtotal;
    }
    
    public double getTaxe(){
        
        tax = subtotal*0.06;
        return tax;
    }
    
    public double getTotal(){
        
        total = subtotal + tax;
        return total;
    }
    
    @Override
    public String toString(){
        
        String str = "the subtotal is : " + subtotal + "the tax amout is : " + tax + "the total is : " + total;
        return str;
    }
    
}
