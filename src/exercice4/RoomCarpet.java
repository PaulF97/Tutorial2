/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice4;

/**
 *
 * @author fishe
 */
public class RoomCarpet {
    
    private RoomDimension dimension;
    private double carpetCost;
    
    public RoomCarpet(RoomDimension dimension, double carpetCost){
        this.dimension = dimension;
        this.carpetCost = carpetCost;
    }

    double getTotalCost(){
        return carpetCost*dimension.getArea();
    }
      
    @Override
    public String toString(){
        
        String str = "price" + carpetCost;
        return str;
      
    }
}
