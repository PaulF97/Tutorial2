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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creat RoomDimension Object
        RoomDimension test = new RoomDimension(5,10);
        
        // creat RoomCarpet Object
        RoomCarpet RoomCarpetObj = new RoomCarpet(test, 500);
        
        System.out.println(" display RoomDimension object " + test);
        System.out.println(" display RoomCarpet object " + RoomCarpetObj.getTotalCost()); 
    }
}
