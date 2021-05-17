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
public class RoomDimension {
    
    private double width;
    private double length;
    
    public RoomDimension(double len, double w){
     
        length = len;
        width = w;
    }
    
    double getArea(){
        
        return width*length;
        
    }
    
    @Override
    public String toString(){
        
        String str = "area" + width*length;
        
        return str;
        
    }
}
