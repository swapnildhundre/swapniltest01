package HelperLayer;

import BaseLayer.SongStore;

public class addSongs extends SongStore  {	
	
	
	 public addSongs(int capacity) {
		super(capacity);
		
	}

	public void addSong(String song) {
	
		
		 if (songs.size() == capacity) {
	            songs.remove(0);
	        }
	        songs.add(song);
	
	
	
	}
       
	   
}
