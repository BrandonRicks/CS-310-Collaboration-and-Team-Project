package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class MacAyres {

	ArrayList<Song> albumTracks;
	String albumTitlte;
	
	public MacAyres() {
	}
	
	public ArrayList<Song> getMacAryesSongs() {
		albumTracks = new ArrayList<Song>();
		Song track1 = new Song("Easy", "Mac Ayres");
		Song track2 = new Song("Slow Down", "Mac Ayres");
		Song track3 = new Song("Lonleyy", "Mac Ayres");
		this.albumTracks.add(track1);
		this.albumTracks.add(track2);
		this.albumTracks.add(track3);
		return albumTracks;
	}
}
