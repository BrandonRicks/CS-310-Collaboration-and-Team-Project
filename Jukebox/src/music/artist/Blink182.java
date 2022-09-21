package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

//Added a new album with two songs.
public class Blink182 {
	ArrayList<Song> albumTracks;
  String albumTitle;
  
  public Blink182() {
  }
  
  public ArrayList<Song> getBlink182Songs() {
  	
  	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
  	 Song track1 = new Song("The Rock Show", "Blink182");                   //Create a song
       Song track2 = new Song("All the Small Things", "Blink182");            //Create another song
       this.albumTracks.add(track1);                                          //Add the first song to song list for Blink182
       this.albumTracks.add(track2);                                          //Add the second song to song list for Blink182
       return albumTracks;                                                    //Return the songs for Blink182 in the form of an ArrayList
  }
}
