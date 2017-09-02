package br.com.grahl.clientes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.grahl.clientes.domain.Cliente;

@Component
public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
	List<Cliente> findAllByOrderByNome();

}
