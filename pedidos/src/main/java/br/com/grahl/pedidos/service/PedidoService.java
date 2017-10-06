package br.com.grahl.pedidos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.grahl.pedidos.repository.PedidoRepository;
import br.com.grahl.pojos.Pedido;

@Service
public class PedidoService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PedidoService.class);
	
	private PedidoRepository repository;
	
	@Autowired
	public void setRepository(PedidoRepository repository) {
		this.repository = repository;
	}
	
	public List<Pedido> getAll() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		StreamSupport.stream(repository.findAll().spliterator(), false).map(i -> toPojo(i)).forEach(pedidos::add);
		return pedidos;
	}
	
	public List<Pedido> getAllByIdCliente(String idCliente) {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		repository.findAllByIdClienteOrderById(idCliente).stream().map(i -> toPojo(i)).forEach(pedidos::add);
		return pedidos;
	}
	
	public Pedido get(String id) {
		LOGGER.debug("get pedido: {}", id);
		Optional<br.com.grahl.pedidos.domain.Pedido> pedidoDomain = repository.findById(id);
		return toPojo(pedidoDomain.get());
	}
	
	public void update(Pedido pedido) {
		br.com.grahl.pedidos.domain.Pedido pedidoDomain = toDomain(pedido);
		repository.save(pedidoDomain);
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	public Pedido insert(Pedido pedido) {
		br.com.grahl.pedidos.domain.Pedido pedidoDomain = toDomain(pedido);
		pedidoDomain =  repository.save(pedidoDomain);
		return toPojo(pedidoDomain);
	}
	
	private Pedido toPojo(br.com.grahl.pedidos.domain.Pedido domain) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(domain, br.com.grahl.pojos.Pedido.class);
	}
	
	private br.com.grahl.pedidos.domain.Pedido toDomain(Pedido pedido) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(pedido, br.com.grahl.pedidos.domain.Pedido.class);
	}

}
