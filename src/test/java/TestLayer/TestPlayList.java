package TestLayer;

import org.testng.annotations.Test;

import HelperLayer.ResentPlayedSongs;

public class TestPlayList {
	
	@Test
	public static void test() {
	ResentPlayedSongs store = new ResentPlayedSongs(3);
     store.addSong("S1");
     store.addSong("S2");
     store.addSong("S3");
     System.out.println(store.getResentPlayedSongs()); 

     store.addSong("S4");
     System.out.println(store.getResentPlayedSongs()); 

     store.addSong("S2");
     System.out.println(store.getResentPlayedSongs()); 
     
     store.addSong("S1");
     System.out.println(store.getResentPlayedSongs());
 }

}
