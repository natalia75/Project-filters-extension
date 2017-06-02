package pl.roomate.run.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.roomate.run.model.UserProfile;
import pl.roomate.run.model.Version;
import pl.roomate.run.repositories.UserRepository;
import pl.roomate.run.search.UserSpecificationsBuilder;
import pl.roomate.run.service.UserService;

@Controller
public class FiltersController {

	private UserService userS;
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us){
		this.userS = us;
		
		UserProfile u1 = new UserProfile();
		u1.setFirstName("Adam");
		u1.setLastName("Mucha");
		this.userS.addNewUser(u1);
	}
	
	@RequestMapping(value="/user/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user")UserProfile newUser){
		this.userS.addNewUser(newUser);
		
		return "redirect:/user";
	}
	
	@Autowired
	private UserRepository repo;
	
	@RequestMapping(method = RequestMethod.GET, value = "/users")
    @ResponseBody
    public List<UserProfile> search(@RequestParam(value = "search") String search) {
        UserSpecificationsBuilder builder = new UserSpecificationsBuilder();
        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
        Matcher matcher = pattern.matcher(search + ",");
        while (matcher.find()) {
            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
        }
         
        Specification<UserProfile> spec = builder.build();
        return repo.findAll(spec);
    }
	
	@RequestMapping(value="/version", method=RequestMethod.GET)
	public @ResponseBody Version sendVersion(){
		return new Version("1.0.0.0",1);
	}
}
