/*
 * Added by: Brandon Ricks
 * CS-310 
 * 06/10/2021
 */

package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class BrandonRicks_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	// In Flames
    InFlames inFlamesBand = new InFlames();
	ArrayList<Song> inFlamesTracks = new ArrayList<Song>();
	
    inFlamesTracks = inFlamesBand.getInFlamesSongs();
	
	playlist.add(inFlamesTracks.get(0));
	playlist.add(inFlamesTracks.get(1));
	playlist.add(inFlamesTracks.get(2));
	
	// Opeth
    Opeth opethBand = new Opeth();
	ArrayList<Song> opethTracks = new ArrayList<Song>();
    opethTracks = opethBand.getOpethSongs();
	
	playlist.add(opethTracks.get(0));
	playlist.add(opethTracks.get(1));
	
    return playlist;
	}
}
