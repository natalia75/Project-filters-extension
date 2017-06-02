package pl.roomate.run.search;

import pl.roomate.run.model.UserProfile;
import pl.roomate.run.search.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

public class UserSpecificationsBuilder {
    
    private final List<SearchCriteria> params;
 
    public UserSpecificationsBuilder() {
        params = new ArrayList<SearchCriteria>();
    }
 
    public UserSpecificationsBuilder with(String key, String operation, Object value) {
        params.add(new SearchCriteria(key, operation, value));
        return this;
    }
 
    public Specification<UserProfile> build() {
        if (params.size() == 0) {
            return null;
        }
 
        List<Specification<UserProfile>> specs = new ArrayList<Specification<UserProfile>>();
        for (SearchCriteria param : params) {
            specs.add(new UserSpecification(param));
        }
 
        Specification<UserProfile> result = specs.get(0);
        for (int i = 1; i < specs.size(); i++) {
            result = Specifications.where(result).and(specs.get(i));
        }
        return result;
    }
}