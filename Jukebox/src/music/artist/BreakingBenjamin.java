package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BreakingBenjamin {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BreakingBenjamin() {
    }
    
    public ArrayList<Song> getBreakingBenjaminSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Red Cold River", "Breaking Benjamin");         //Create a song
    	 Song track2 = new Song("Torn in Two", "Breaking Benjamin");			//Create another song
    	 Song track3 = new Song("Diary of Jane", "Breaking Benjamin");			//Create another song 
    	 Song track4 = new Song("Angels Fall", "Breaking Benjamin");			// Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Breaking Benjamin
         this.albumTracks.add(track2);  										//Add the second song to song list for Breaking Benjamin 
         this.albumTracks.add(track3);											//Add the third song to song list for Breaking Benjamin 
         this.albumTracks.add(track4);											//Add the fourth song to song list for Breaking Benjamin
         return albumTracks;                                                    //Return the songs for the Breaking Benjamin in the form of an ArrayList
    }

	public static void main(String[] args) {
	}
}