package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class ChloeNinefeldt_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//Array lists for tracks
	ArrayList<Song> BreakingBenjaminTracks = new ArrayList<Song>();
	ArrayList<Song> DiamanteTracks = new ArrayList<Song>();
	ArrayList<Song> ImagineDragonsTracks = new ArrayList<Song>();
		
	BreakingBenjamin BreakingBenjamin = new BreakingBenjamin();
	Diamante Diamante = new Diamante();
	ImagineDragons ImagineDragons = new ImagineDragons();
	
	//Call to artist's class
	BreakingBenjaminTracks = BreakingBenjamin.getBreakingBenjaminSongs();
	DiamanteTracks = Diamante.getDiamanteSongs();
	ImagineDragonsTracks = ImagineDragons.getImagineDragonsSongs();
	
	// Add songs from Breaking Benjamin to playlist
	playlist.add(BreakingBenjaminTracks.get(0));
	playlist.add(BreakingBenjaminTracks.get(1));
	playlist.add(BreakingBenjaminTracks.get(2));
	playlist.add(BreakingBenjaminTracks.get(3));
	
	// add tracks from Diamante
	playlist.add(DiamanteTracks.get(0));
	playlist.add(DiamanteTracks.get(1));
	
	// add tracks from ImagineDragons
	playlist.add(ImagineDragonsTracks.get(0));
	playlist.add(ImagineDragonsTracks.get(1));
	playlist.add(ImagineDragonsTracks.get(2));
	
    return playlist;
	}
}
