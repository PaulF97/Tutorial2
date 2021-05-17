/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice6;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author fishe
 */
public class MainRecording {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList<String> titleList = new ArrayList<String>();
        ArrayList<String> artistList = new ArrayList<String>();
        ArrayList<Integer> timeList = new ArrayList<Integer>();
        ArrayList<Recording> objList = new ArrayList<Recording>();

        
        // title list
        for(int i =0; i<5; i++){
            System.out.println("enter the title number " + i + " : ");
            String title = keyboard.next();
            titleList.add(title);
        }
        
        // artist list
        for(int i =0; i<5; i++){
            System.out.println("enter the artist number " + i + " : ");    
            String artist = keyboard.next();
            artistList.add(artist);
        }
        
        // title list
        for(int i =0; i<5; i++){
            System.out.println("enter the the duration of music number " + i + " : ");
            int time = keyboard.nextInt();
            timeList.add(time);
        }
        
        // create of object of recording
        for(int i =0; i<5; i++){
            Recording information = new Recording(titleList.get(i), artistList.get(i), timeList.get(i));
            objList.add(information);
        }
        
        // display
        for (int i = 0; i<5; i++){
            System.out.println("music information number " + i +" : " + objList.get(i));
        }
    }
}
