/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;

/**
 *
 * @author fishe
 */
public class Billing {
    
    private double price1;
    private double price2;
    private double price3;
    
    public Billing(double price1,double price2,double price3){
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        
    }
    
    public double computeBilling(double price){
        
        price1 = price*1.08;
        
        return price1;
    }
    
    public double computeBilling(double price, int quantity){
        
        price2 = (price*quantity)*1.08;
        return price2;
    }
    
    public double computeBilling(double price, int nb_livre, double coupon){
        
        price3 =  ((price * nb_livre - coupon) * 1.08);
            
        if(price3>=0){ // data the price is positive
            return price3;
        } else {
            return 0;
            
        }
    }
    
    @Override
    public String toString(){
        String str = "8% tax " + price1 + " quantity & tax : " + price2 + " quantity & coupon & tax : " + price3 ;
               return str;
    }
}
