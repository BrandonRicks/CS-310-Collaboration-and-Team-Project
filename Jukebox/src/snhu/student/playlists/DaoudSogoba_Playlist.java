package snhu.student.playlists;
import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.KanyeWest;
import music.artist.MacAyres;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

public class DaoudSogoba_Playlist {
	
	public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		ArrayList<Song> macAyresTracks = new ArrayList<Song>();
		MacAyres theMacAyres = new MacAyres();
		
		macAyresTracks =  theMacAyres.getMacAryesSongs();
		
		playlist.add(macAyresTracks.get(0));
		playlist.add(macAyresTracks.get(1));
		playlist.add(macAyresTracks.get(2));
		
		KanyeWest theKanyeWest = new KanyeWest();
		ArrayList<Song> kanyeWestTracks = new ArrayList<Song>();
		kanyeWestTracks = theKanyeWest.getKanyeWestSongs();
		
		playlist.add(kanyeWestTracks.get(0));
		playlist.add(kanyeWestTracks.get(1));
		playlist.add(kanyeWestTracks.get(2));
		
		return playlist;

	}
}
