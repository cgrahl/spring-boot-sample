package br.com.grahl.pedidos.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grahl.pedidos.domain.Pedido;
import br.com.grahl.pedidos.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PedidoService.class);
	
	private PedidoRepository repository;
	
	@Autowired
	public void setRepository(PedidoRepository repository) {
		this.repository = repository;
	}
	
	public Iterable<Pedido> getAll() {
		return repository.findAll();
	}
	
	public List<Pedido> getAllByIdCliente(String idCliente) {
		return repository.findAllByIdClienteOrderById(idCliente);
	}
	
	public Pedido get(String id) {
		LOGGER.debug("get pedido: {}", id);
		return repository.findOne(id);
	}
	
	public void update(Pedido pedido) {
		repository.save(pedido);
	}
	
	public void delete(String id) {
		repository.delete(id);
	}
	
	public Pedido insert(Pedido pedido) {
		return repository.save(pedido);
	}

	

}
