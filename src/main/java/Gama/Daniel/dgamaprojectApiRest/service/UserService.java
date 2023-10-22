package Gama.Daniel.dgamaprojectApiRest.service;

import Gama.Daniel.dgamaprojectApiRest.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);
	

}
