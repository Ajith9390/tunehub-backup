package com.kodnest.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.entity.Playlist;
import com.kodnest.tunehub.entity.Song;
import com.kodnest.tunehub.repository.PlaylistRepository;

import com.kodnest.tunehub.service.PlaylistService;

@Service
public class PlaylistServiceimpl implements PlaylistService {

	@Autowired
	PlaylistRepository  playlistRepository;

	@Override
	public void addplaylist(Playlist playlist) {
		playlistRepository.save(playlist);

	}

	@Override
public List<Playlist>fetchAllPlaylists(){
	List<Playlist>allplaylist=playlistRepository.findAll();
	return allplaylist;
}

	@Override
	public void updateSong(Song s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Playlist> fetchAllPlaylist() {
		// TODO Auto-generated method stub
		return null;
	}
}
