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
public class RetailItems {
    
    private String description;
    private int unitsOnHand;
    private double price;
    
    // constructor
    public RetailItems(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    
    // getter
    public String getDescription(){
        return description;
    }
    
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    
    public double getPrice(){
        return price;
    }
    
    // setter
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
}
