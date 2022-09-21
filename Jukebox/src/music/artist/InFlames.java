/*
 * Added by: Brandon Ricks
 * CS-310 
 * 06/01/2021
 */

package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class InFlames {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public InFlames() {
    }
    
    public ArrayList<Song> getInFlamesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Take This Life", "In Flames"); 	            //Create a song
         Song track2 = new Song("Clayman", "In Flames");					 	//Create another song
         Song track3 = new Song("Cloud Connected", "In Flames");    			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for In Flames
         this.albumTracks.add(track2);                                          //Add the second song to song list for In Flames 
         this.albumTracks.add(track3);                                          //Add the second song to song list for In Flames 
         return albumTracks;                                                    //Return the songs for In Flames in the form of an ArrayList
    }
}
