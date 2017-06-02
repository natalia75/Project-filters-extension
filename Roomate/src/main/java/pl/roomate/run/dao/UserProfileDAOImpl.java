package pl.roomate.run.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import pl.roomate.run.model.*;

@Repository
public class UserProfileDAOImpl implements UserProfileDAO{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void addUser(UserProfile newUser){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(newUser);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserProfile> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserProfile> usersList = session.createQuery("from UserProfile").list();
		
		return usersList;
	}
}
