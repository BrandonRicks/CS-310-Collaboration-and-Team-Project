package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class BrianHouts_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
		
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	// Songs from AC/DC added to playlist.
	ArrayList<Song> ACDCTracks = new ArrayList<Song>();
    ACDC acdcBand = new ACDC();
    ACDCTracks = acdcBand.getACDCSongs();
	
	playlist.add(ACDCTracks.get(0));
	playlist.add(ACDCTracks.get(1));
	
	//Songs from the eagles added to playlist.
	Eagles eagles = new Eagles();
	ArrayList<Song> eaglesTracks = new ArrayList<Song>();
	eaglesTracks = eagles.getEaglesSongs();
	
	playlist.add(eaglesTracks.get(0));
	playlist.add(eaglesTracks.get(1));
	playlist.add(eaglesTracks.get(2));
	
	// Song from another student
	FooFighters foofighters = new FooFighters();
	ArrayList<Song> foofightersTracks = new ArrayList<Song>();
	foofightersTracks = foofighters.getFooFightersSongs();
	
	playlist.add(foofightersTracks.get(0));
	
	
    return playlist;
	}
}
