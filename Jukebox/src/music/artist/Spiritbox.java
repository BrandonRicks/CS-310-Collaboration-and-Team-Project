package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Spiritbox {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Spiritbox() {
    }
    
    public ArrayList<Song> getSpiritboxSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Circle With Me", "Spiritbox");             	//Create a song
         Song track2 = new Song("Rule Of Nines", "Spiritbox");					//Create another song
         Song track3 = new Song("Blessed Be", "Spiritbox");						//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Spiritbox
         this.albumTracks.add(track2);											//Add the second song to song list for Spiritbox
         this.albumTracks.add(track3);											//Add the third song to song list for Spiritbox
         return albumTracks;                                                    //Return the songs for Spiritbox in the form of an ArrayList
    }
}
