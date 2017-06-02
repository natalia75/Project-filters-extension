package pl.roomate.run.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.repository.CrudRepository;

import pl.roomate.run.model.UserProfile;

import java.util.List;

public interface UserRepository extends JpaRepository<UserProfile, Long>, JpaSpecificationExecutor<UserProfile>{
}
