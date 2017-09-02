package br.com.grahl.clientes.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grahl.clientes.domain.Cliente;
import br.com.grahl.clientes.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClienteService.class);
	
	private ClienteRepository repository;
	
	@Autowired
	public void setRepository(ClienteRepository repository) {
		this.repository = repository;
	}
	
	public List<Cliente> getAll() {
		return repository.findAllByOrderByNome();
	}
	
	public Cliente get(String id) {
		LOGGER.debug("get cliente: {}", id);
		return repository.findOne(id);
	}
	
	public void update(Cliente cliente) {
		repository.save(cliente);
	}
	
	public void delete(String id) {
		repository.delete(id);
	}
	
	public Cliente insert(Cliente cliente) {
		return repository.save(cliente);
	}

}
