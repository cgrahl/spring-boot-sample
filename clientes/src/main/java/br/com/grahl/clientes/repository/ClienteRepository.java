package br.com.grahl.clientes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import br.com.grahl.clientes.domain.Cliente;

@Component
public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
	List<Cliente> findAllByOrderByNome();
	
	@Query("from Cliente c where lower(c.nome) like CONCAT('%', lower(:nome), '%')")
	List<Cliente> findByNome(@Param("nome") String nome);


}
