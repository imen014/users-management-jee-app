package org.pack1.beans;

import java.util.ArrayList;

public class CreateUser {
	ArrayList<UserRegistry> listUser = new ArrayList<UserRegistry>();
	int count = 0;
	
	public void addUser(UserRegistry user) {
		listUser.add(user);
		count++;
		
	}
	
	public void afficher_nombre_user() {
		System.out.println(count);
	}

	
	public void se_desinscrire(UserRegistry registration) {
		for(UserRegistry user : listUser) {
			if(registration==user) {
				listUser.remove(user);
				System.out.println("user deleted !");

				
			}
			
		}
		
	}
}
