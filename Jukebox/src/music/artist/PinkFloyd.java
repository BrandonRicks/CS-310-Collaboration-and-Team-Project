package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class PinkFloyd {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PinkFloyd() {
    }
    
    public ArrayList<Song> getPinkFloydSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Wish You Were Here", "Pink Floyd");            //Create a song
         Song track2 = new Song("Shine On You Crazy Diamond", "Pink Floyd");    //Create another song
         Song track3 = new Song("Hey You", "Pink Floyd");        				//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Pink Floyd
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Pink Floyd
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Pink Floyd 
         return albumTracks;                                                    //Return the songs for the Pink Floyd in the form of an ArrayList
    }
}
