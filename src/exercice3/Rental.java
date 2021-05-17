/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercice3;

/**
 *
 * @author fishe
 */
public class Rental {
    
    // attributs
    static public int rentalRate = 40; // constant
    private double contractNumber;
    private float numberHoursRental;
    private long numberMinutes;
    private double totalPrice;
    
    // constructors
    public Rental(double contractNumber, long numberMinutes){
        this.contractNumber = contractNumber;
        this.numberMinutes = numberMinutes;

    }
    
    // getter
    public double getcontractNumber(){
        return contractNumber;
    }
    
    public double getHoursRental(){
        return numberHoursRental;
    }
    
    public long getNumberMinutes(){
        return numberMinutes;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
    

    // méthods
    public void calculatPrice(){
                
        numberHoursRental = (numberMinutes / 60); // convert minuts to hours
        totalPrice = numberHoursRental * rentalRate;
        
    }
    
    // display data
    @Override
    public String toString(){
        String str = " total price : " + totalPrice + " Number of minuts : " + numberMinutes + " Number of houres : " + numberHoursRental ;
        
        return str; 
    }
}
