package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Podcast {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Podcast() {
    }
    
    public ArrayList<Song> getPDP() {
    	
    	 albumTracks = new ArrayList<Song>();                                  
    	 Song track1 = new Song("Lex Fridman Podcast", "Lex Fridman");            
         Song track2 = new Song("The Joe Rogan Experience", "Joe Rogan");   
         Song track3 = new Song("TED Talks Daily", "TED");
         Song track4 = new Song("Robinhood Snacks", "Robinhood Financial, LLC");
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);
         this.albumTracks.add(track3); 
         this.albumTracks.add(track4);
         return albumTracks;                                                   
    }
}