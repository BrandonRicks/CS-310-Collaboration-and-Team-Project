package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

//Added a new album with three songs.
public class TheJimiHendrixExperience {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheJimiHendrixExperience() {
    }
    
    public ArrayList<Song> getHendrixSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                    //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Purple Haze", "The Jimi Hendrix Experience");   //Create a song
         Song track2 = new Song("Little Wing", "The Jimi Hendrix Experience");   //Create another song
         Song track3 = new Song("Voodoo Child", "The Jimi Hendrix Experience");  //Created a third song
         this.albumTracks.add(track1);                                           //Add the first song to song list for the Jimi Hendrix Experience
         this.albumTracks.add(track2);                                           //Add the second song to song list for the Jimi Hendrix Experience
         this.albumTracks.add(track3);  										 //Add the third song to song list for the Jimi Hendrix Experience
         return albumTracks;                                                     //Return the songs for the Jimi Hendrix Experience in the form of an ArrayList
    }
}

