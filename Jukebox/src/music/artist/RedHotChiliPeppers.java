package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class RedHotChiliPeppers {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public RedHotChiliPeppers() {
    }
    
    public ArrayList<Song> getRedHotChiliPeppersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Dani California", "Red Hot Chili Peppers");    //Create the song Dani California
         Song track2 = new Song("Can't Stop", "Red Hot Chili Peppers");         //Create the song Can't Stop
         this.albumTracks.add(track1);                                          //Add the first song to song list for the RHCP
         this.albumTracks.add(track2);                                          //Add the second song to song list for the RHCP
         return albumTracks;                                                    //Return the songs for RHCP in the form of an ArrayList
    }
}