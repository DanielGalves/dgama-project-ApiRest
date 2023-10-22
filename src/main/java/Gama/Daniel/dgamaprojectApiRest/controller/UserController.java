package Gama.Daniel.dgamaprojectApiRest.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import Gama.Daniel.dgamaprojectApiRest.domain.model.User;
import Gama.Daniel.dgamaprojectApiRest.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		var user = userService.findById(id);
		
		return ResponseEntity.ok(user);
		
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<User> create(@RequestBody User userToCreated){
		
		var userCreated = userService.create(userToCreated);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(userCreated.getId())
				.toUri();
		return ResponseEntity.ok(userToCreated);
		
	}
	
	
	
	
}
