package br.com.grahl.server.oauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.grahl.server.oauth2.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}
