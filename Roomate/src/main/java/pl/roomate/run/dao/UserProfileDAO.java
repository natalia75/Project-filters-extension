package pl.roomate.run.dao;

import java.util.List;

import pl.roomate.run.model.UserProfile;

public interface UserProfileDAO {
	public void addUser(UserProfile newUser);
	/*public void updateUser(UserProfile userToUpdate);*/
	public List<UserProfile> listUsers();
	/*public UserProfile getUserById(int id);
	public void removeUser(int id);*/
}
