package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Eagles {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Eagles() {
    }
    
    public ArrayList<Song> getEaglesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Desperado", "The Eagles");             //Create a song
         Song track2 = new Song("Hotel California", "The Eagles");         //Create another song
          Song track3 = new Song("Life in The Fast Lane", "The Eagles");
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }

}
