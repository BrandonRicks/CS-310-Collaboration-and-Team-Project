package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class KanyeWest {

	ArrayList<Song> albumTracks;
	String albumTitlte;
	
	public KanyeWest() {
	}
	
	public ArrayList<Song> getKanyeWestSongs() {
		albumTracks = new ArrayList<Song>();
		Song track1 = new Song("Runaway", "Kanye West");
		Song track2 = new Song("Devil In A New Dress", "Kanye West");
		Song track3 = new Song("Dark Fantasy", "Kanye West");
		this.albumTracks.add(track1);
		this.albumTracks.add(track2);
		this.albumTracks.add(track3);
		return albumTracks;
	}
}
