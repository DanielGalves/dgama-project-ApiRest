package Gama.Daniel.dgamaprojectApiRest.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import Gama.Daniel.dgamaprojectApiRest.domain.model.User;
import Gama.Daniel.dgamaprojectApiRest.domain.repository.UserRepository;
import Gama.Daniel.dgamaprojectApiRest.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	public UserServiceImpl (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		// TODO Auto-generated method stub
		if (userRepository.existsById(userToCreate.getId())) {
			throw new IllegalArgumentException("This User ID alread exists");
			
		}
		return userRepository.save(userToCreate);
	}

}
