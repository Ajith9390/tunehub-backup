package com.kodnest.tunehub.service;

import com.kodnest.tunehub.entity.User;

public interface UserService {
	
	public  String addUser(User user);
	
	public boolean emailExists (String email) ;
	

	public boolean validateUser(String email, String password) ;
	
	public String getRole(String email);
	
	public void updateUser(User user);

	User getUser(String email);

	void upadte(User user);
	
	
	
	
	
	
		

		
	
	
	

}
