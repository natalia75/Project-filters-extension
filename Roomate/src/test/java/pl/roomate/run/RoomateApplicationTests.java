package pl.roomate.run;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.roomate.run.model.UserProfile;
import pl.roomate.run.persistence.PersistenceJPAConfig;
import pl.roomate.run.repositories.UserRepository;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceJPAConfig.class })
public class RoomateApplicationTests {
	@Autowired
    private UserRepository repository;
 
    private UserProfile user1;
    private UserProfile user2;
 
    @Before
    public void init() {
        user1 = new UserProfile();
        user1.setFirstName("Adam");
        user1.setLastName("Mucha");
        user1.setEmail("a.mucha@gmail.com");
        user1.setAge(22);
        repository.save(user1);
 
        user2 = new UserProfile();
        user2.setFirstName("Adam");
        user2.setLastName("Pietrucha");
        user2.setEmail("a.pietrucha@gmail.com");
        user2.setAge(28);
        repository.save(user2);
    }
    
	@Test
	public void contextLoads() {
	}

}
