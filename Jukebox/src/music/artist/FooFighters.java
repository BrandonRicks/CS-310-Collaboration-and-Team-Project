package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FooFighters {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FooFighters() {
    }
    
    public ArrayList<Song> getFooFightersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Pretender", "Foo Fighters");             	//Create the song The Pretender
         Song track2 = new Song("All My Life", "Foo Fighters");         		//Create the song All My Life
         Song track3 = new Song("Walk", "Foo Fighters");						//Create the songs Walk
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Foo Fighters
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Foo Fighters
         this.albumTracks.add(track3);											//Add the third song to song list for Foo Fighters
         return albumTracks;                                                    //Return the songs for Foo FIghters in the form of an ArrayList
    }
}
