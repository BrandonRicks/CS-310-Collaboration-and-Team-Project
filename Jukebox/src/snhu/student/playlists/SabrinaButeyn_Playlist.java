package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class SabrinaButeyn_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	// Add Metallica songs to playlist
	ArrayList<Song> metallicaTracks = new ArrayList<Song>();
    Metallica metallica = new Metallica();
    metallicaTracks = metallica.getMetallicaSongs();
	
	playlist.add(metallicaTracks.get(0));
	playlist.add(metallicaTracks.get(1));	

	// Add Pink Floyd songs to playlist
	ArrayList<Song> pinkFloydTracks = new ArrayList<Song>();
    PinkFloyd pinkFloyd = new PinkFloyd();
	pinkFloydTracks = pinkFloyd.getPinkFloydSongs();
	
	playlist.add(pinkFloydTracks.get(0));
	playlist.add(pinkFloydTracks.get(1));
	playlist.add(pinkFloydTracks.get(2));
	
	// Add Jimi Hendrix songs to playlist
	ArrayList<Song> hendrixTracks = new ArrayList<Song>();
    TheJimiHendrixExperience hendrix = new TheJimiHendrixExperience();
    hendrixTracks = hendrix.getHendrixSongs();
	
	playlist.add(hendrixTracks.get(1));
	
    return playlist;
	}
}
