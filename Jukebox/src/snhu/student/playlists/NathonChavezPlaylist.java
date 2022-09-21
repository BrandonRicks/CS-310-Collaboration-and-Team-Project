package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class NathonChavezPlaylist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> DrakeTracks = new ArrayList<Song>();
	Drake drizzy = new Drake();
	
    DrakeTracks = drizzy.getDrizzySongs();
	
	playlist.add(DrakeTracks.get(0));
	playlist.add(DrakeTracks.get(1));
	playlist.add(DrakeTracks.get(2));
	playlist.add(DrakeTracks.get(3));
	playlist.add(DrakeTracks.get(4));
	
    CamilleSaintSaens CSS = new CamilleSaintSaens();
    ArrayList<Song> CamilleSaintSaensTracks = new ArrayList<Song>();
    CamilleSaintSaensTracks = CSS.getCSSSongs();
	
	
	playlist.add(CamilleSaintSaensTracks.get(0));
	playlist.add(CamilleSaintSaensTracks.get(1));
	playlist.add(CamilleSaintSaensTracks.get(2));
	
	
	 RandomSongs RS = new RandomSongs();
	 ArrayList<Song> RandomSongsTracks = new ArrayList<Song>();
	 RandomSongsTracks = RS.getRSSongs();
		
		
	 playlist.add(RandomSongsTracks.get(0));
	 playlist.add(RandomSongsTracks.get(1));
	 
	 
	 Podcast PDP = new Podcast();
	 ArrayList<Song> PodcastTracks = new ArrayList<Song>();
	 PodcastTracks = PDP.getPDP();
	 
	 playlist.add(PodcastTracks.get(0));
	 playlist.add(PodcastTracks.get(1));
	 playlist.add(PodcastTracks.get(2));
	 //test commit
	
    return playlist;
	}
	
}
