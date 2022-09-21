package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Treys_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> spiritboxTracks = new ArrayList<Song>();
    Spiritbox spiritbox = new Spiritbox();
	
    spiritboxTracks = spiritbox.getSpiritboxSongs();
	
	playlist.add(spiritboxTracks.get(0));
	playlist.add(spiritboxTracks.get(1));
	playlist.add(spiritboxTracks.get(2));
	
	
	Haken haken = new Haken();
	ArrayList<Song> hakenTracks = new ArrayList<Song>();
    hakenTracks = haken.getHakenSongs();
	
	playlist.add(hakenTracks.get(0));
	playlist.add(hakenTracks.get(1));
	playlist.add(hakenTracks.get(2));
	
	
    return playlist;
	}
}