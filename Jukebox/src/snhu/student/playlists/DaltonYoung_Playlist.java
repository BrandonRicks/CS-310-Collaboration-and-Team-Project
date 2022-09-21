package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

// Playlist for Dalton Young
public class DaltonYoung_Playlist {
    
	// Create and return the playlist
	public LinkedList<PlayableSong> StudentPlaylist(){
		
		// Declare a new LinkedList of PlayableSings as the playlist
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		// Get the Foo Fighters Songs and put them in an ArrayList
		ArrayList<Song> fooFightersTracks = new ArrayList<Song>();
		FooFighters fooFighters = new FooFighters();
		fooFightersTracks = fooFighters.getFooFightersSongs();
		
		// Add the Foo Fighters songs to the playlist
		for (int i = 0; i < fooFightersTracks.size(); i++) {
			playlist.add(fooFightersTracks.get(i));
		}
		
		// Get the RHCP Songs
		ArrayList<Song> rhcpTracks = new ArrayList<Song>();
		RedHotChiliPeppers rhcp = new RedHotChiliPeppers();
		rhcpTracks = rhcp.getRedHotChiliPeppersSongs();
		
		// Add the RHCP songs to the playlist
		for (int i = 0; i < rhcpTracks.size(); i ++) {
			playlist.add(rhcpTracks.get(i));
		}
		
		// Add one Imagine Dragons song to the playlist
		ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		ImagineDragons imagineDragons = new ImagineDragons();
		imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		playlist.add(imagineDragonsTracks.get(0));
		
		return playlist;
	}

}
