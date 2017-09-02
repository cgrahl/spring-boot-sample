package br.com.grahl.pedidos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.grahl.pedidos.domain.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, String> {
	
	List<Pedido> findAllByIdClienteOrderById(String idCliente);

}
