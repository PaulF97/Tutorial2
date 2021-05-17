/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice6;

/**
 *
 * @author fishe
 */
public class Recording {
    
    private String title;
    private String artist;
    private int time;
    
    public Recording(String title, String artist, int time){
        this.title = title;
        this.artist = artist;
        this.time = time;
    }
    
    // getter
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public int getTime(){
        return time;
    }
    
    // setter
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    @Override
    public String toString(){
        
        String data;
        data = "the title is : " + title + " the artist is : " + artist + " the duration of music is : " + time;
        return data;
    }
   
}
