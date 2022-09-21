package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class CamilleSaintSaens {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public CamilleSaintSaens() {
    }
    
    public ArrayList<Song> getCSSSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                  
    	 Song track1 = new Song("Introduction and Rondo Capriciosso in A Minor", "Camille Saint-Saens");            
         Song track2 = new Song("The Carnival of Animals: Le Cygne", "Camille Saint-Saens");   
         Song track3 = new Song("Danse Macabre", "Camille Saint-Saens");                           
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);
         this.albumTracks.add(track3); 
         return albumTracks;                                                   
    }
}