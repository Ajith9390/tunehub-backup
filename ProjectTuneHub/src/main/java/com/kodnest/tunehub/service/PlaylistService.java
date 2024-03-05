package com.kodnest.tunehub.service;

import java.util.List;

import com.kodnest.tunehub.entity.Playlist;
import com.kodnest.tunehub.entity.Song;


public interface PlaylistService {

	public void updateSong(Song s);

	public List<Playlist> fetchAllPlaylists();



	public void addplaylist(Playlist playlist);

	List<Playlist> fetchAllPlaylist();





}
