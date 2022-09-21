package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class ACDC {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ACDC() {
    }
    
    public ArrayList<Song> getACDCSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Thunderstruck", "ACDC");             //Create a song
         Song track2 = new Song("Back in Black", "ACDC");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}
