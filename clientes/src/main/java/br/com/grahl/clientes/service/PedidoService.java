package br.com.grahl.clientes.service;

import java.util.List;

import br.com.grahl.pojos.Pedido;

public interface PedidoService {
	
	List<Pedido> getPedidosByIdCliente(String idCliente);

}
