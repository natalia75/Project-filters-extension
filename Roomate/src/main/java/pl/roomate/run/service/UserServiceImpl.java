package pl.roomate.run.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.roomate.run.dao.UserProfileDAO;
import pl.roomate.run.model.UserProfile;

@Service
public class UserServiceImpl implements UserService{

	private UserProfileDAO userDAO;

	public void setUserDAO(UserProfileDAO userDAO){
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addNewUser(UserProfile newUser) {
		this.userDAO.addUser(newUser);	
	}

	@Override
	@Transactional
	public List<UserProfile> listPersons() {
		return this.userDAO.listUsers();
	}
}
