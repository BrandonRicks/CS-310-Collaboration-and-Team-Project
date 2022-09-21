/*
 * Added by: Brandon Ricks
 * CS-310 
 * 06/01/2021
 */

package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Opeth {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Opeth() {
    }
    
    public ArrayList<Song> getOpethSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
         Song track1 = new Song("Ghost of Perdition", "Opeth");					//Create a song
         Song track2 = new Song("Blackwater Park", "Opeth");    				//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Opeth
         this.albumTracks.add(track2);                                          //Add the second song to song list for Opeth 
         return albumTracks;                                                    //Return the songs for Opeth in the form of an ArrayList
    }
}
