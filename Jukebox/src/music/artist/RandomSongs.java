package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class RandomSongs {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public RandomSongs() {
    }
    
    public ArrayList<Song> getRSSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                  
    	 Song track1 = new Song("Mmmh", "KAI");            
         Song track2 = new Song("Any Song", "ZICO");                 
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                              
         return albumTracks;                                                   
    }
}