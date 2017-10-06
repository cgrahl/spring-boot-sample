package br.com.grahl.clientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.grahl.pojos.Pedido;

@Service
@Profile("production")
public class RuntimePedidoService implements PedidoService {
	
	@Autowired
	PedidosServiceProxy proxy;

	@Override
	public List<Pedido> getPedidosByIdCliente(String idCliente) {
		return proxy.getAllByidCliente(idCliente);
	}

}
