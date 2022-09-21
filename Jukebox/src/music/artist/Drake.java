package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Drake {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Drake() {
    }
    
    public ArrayList<Song> getDrizzySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                  
    	 Song track1 = new Song("Marvins Room", "Drake");            
         Song track2 = new Song("Hotline Bling", "Drake");   
         Song track3 = new Song("Crew Love", "Drake");            
         Song track4 = new Song("Take Care", "Drake ft. Rihanna");
         Song track5 = new Song("Passionfruit", "Drake");               
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);
         this.albumTracks.add(track3);                                          
         this.albumTracks.add(track4);
         this.albumTracks.add(track5);                                               
         return albumTracks;                                                   
    }
}