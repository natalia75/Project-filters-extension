package pl.roomate.run.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.roomate.run.model.UserProfile;

public interface UserService {
	public void addNewUser(UserProfile newUser);
	public List<UserProfile> listPersons();
}
