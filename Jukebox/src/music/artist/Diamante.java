package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Diamante {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Diamante() {
    }
    
    public ArrayList<Song> getDiamanteSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                              //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Ghost Myself", "Diamante");               //Create a song
         Song track2 = new Song("Iris", "Diamante");         			   //Create another song
         this.albumTracks.add(track1);                                     //Add the first song to song list for Diamante
         this.albumTracks.add(track2);                                     //Add the second song to song list for Diamante 
         return albumTracks;                                               //Return the songs for Diamante in the form of an ArrayList
    }
}