package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}

	// Added test case for Eagles.
	@Test
	public void testGetEaglesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Eagles eagles = new Eagles();
		 ArrayList<Song> eaglesTracks = new ArrayList<Song>();
		 eaglesTracks = eagles.getEaglesSongs();
		 assertEquals(3, eaglesTracks.size());
	}
	
	// Added test case for ACDC
	@Test
	public void testGetACDCAlbumSize() throws NoSuchFieldException, SecurityException {
		 ACDC acdc = new ACDC();
		 ArrayList<Song> acdcTracks = new ArrayList<Song>();
		 acdcTracks = acdc.getACDCSongs();
		 assertEquals(2, acdcTracks.size());
	}

	//JUnit test for the amount of Jimi Hendrix songs on the album equals 3.
	@Test
	public void testGetJimiHendrixAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheJimiHendrixExperience hendrix = new TheJimiHendrixExperience();
		 ArrayList<Song> hendrixTracks = new ArrayList<Song>();
		 hendrixTracks = hendrix.getHendrixSongs();
		 assertEquals(3, hendrixTracks.size());
	}
	
	//JUnit test for the amount of Blink182 songs on the album equals 2.
	@Test
	public void testGetBlink182AlbumSize() throws NoSuchFieldException, SecurityException {
		 Blink182 blink182 = new Blink182();
		 ArrayList<Song> blink182Tracks = new ArrayList<Song>();
		 blink182Tracks = blink182.getBlink182Songs();
		 assertEquals(2, blink182Tracks.size());
	}	
	
	// Added unit test for band In Flames - Brandon Ricks
	@Test
	public void testGetInFlamesAlbumSize() throws NoSuchFieldException, SecurityException {
		 InFlames inFlames = new InFlames();
		 ArrayList<Song> inFlamesTracks = new ArrayList<Song>();
		 inFlamesTracks = inFlames.getInFlamesSongs();
		 assertEquals(3, inFlamesTracks.size());
	}
	
	// Added unit test for band Opeth - Brandon Ricks
	@Test
	public void testGetOpethAlbumSize() throws NoSuchFieldException, SecurityException {
		 Opeth opeth = new Opeth();
		 ArrayList<Song> opethTracks = new ArrayList<Song>();
		 opethTracks = opeth.getOpethSongs();
		 assertEquals(2, opethTracks.size());
	}
	
	// Test to verify that Foo Fighters album contains 3 songs
	@Test
	public void testGetFooFightersAlbumSize() throws NoSuchFieldException, SecurityException {
		 FooFighters fooFighters = new FooFighters();
		 ArrayList<Song> fooFightersTracks = new ArrayList<Song>();
		 fooFightersTracks = fooFighters.getFooFightersSongs();
		 assertEquals(3, fooFightersTracks.size());
	}

	// Test to verify that RHCP album contains 2 songs
	@Test
	public void testGetRedHotChiliPeppersAlbumSize() throws NoSuchFieldException, SecurityException {
		 RedHotChiliPeppers rhcp = new RedHotChiliPeppers();
		 ArrayList<Song> rhcpTracks = new ArrayList<Song>();
		 rhcpTracks = rhcp.getRedHotChiliPeppersSongs();
		 assertEquals(2, rhcpTracks.size());
	}
	
	@Test
	//Breaking Benjamin album size information
	public void testGetBreakingBenjaminAlbumSize() throws NoSuchFieldException, SecurityException {
		BreakingBenjamin BreakingBenjamin = new BreakingBenjamin();
		 ArrayList<Song> BreakingBenjaminTracks = new ArrayList<Song>();
		 BreakingBenjaminTracks = BreakingBenjamin.getBreakingBenjaminSongs();
		 assertEquals(4, BreakingBenjaminTracks.size());
	}
	
	@Test
	//Diamante album size information
	public void testGetDiamanteAlbumSize() throws NoSuchFieldException, SecurityException {
		Diamante Diamante = new Diamante();
		 ArrayList<Song> DiamanteTracks = new ArrayList<Song>();
		 DiamanteTracks = Diamante.getDiamanteSongs();
		 assertEquals(2, DiamanteTracks.size());
	}	
	
	// Add test case for Metallica album size
	@Test
	public void testGetMetallicaAlbumSize() throws NoSuchFieldException, SecurityException {
		 Metallica metallica = new Metallica();
		 ArrayList<Song> metallicaTracks = new ArrayList<Song>();
		 metallicaTracks = metallica.getMetallicaSongs();
		 assertEquals(2, metallicaTracks.size());
	}
	
	// Add test case for Pink Floyd album size
	@Test
	public void testGetPinkFloydAlbumSize() throws NoSuchFieldException, SecurityException {
		 PinkFloyd pinkFloyd = new PinkFloyd();
		 ArrayList<Song> pinkFloydTracks = new ArrayList<Song>();
		 pinkFloydTracks = pinkFloyd.getPinkFloydSongs();
		 assertEquals(3, pinkFloydTracks.size());
	}
}