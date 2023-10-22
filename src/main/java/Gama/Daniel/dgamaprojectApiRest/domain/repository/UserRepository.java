package Gama.Daniel.dgamaprojectApiRest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Gama.Daniel.dgamaprojectApiRest.domain.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	}
