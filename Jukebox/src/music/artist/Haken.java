package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Haken {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Haken() {
    }
    
    public ArrayList<Song> getHakenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Prosthetic", "Haken");             			//Create a song
         Song track2 = new Song("Invasion", "Haken");							//Create another song
         Song track3 = new Song("Puzzle Box", "Haken");							//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Haken
         this.albumTracks.add(track2);											//Add the second song to song list for Haken 
         this.albumTracks.add(track3);											//Add the third song to song list for Haken 
         return albumTracks;                                                    //Return the songs for Haken in the form of an ArrayList
    }
}
