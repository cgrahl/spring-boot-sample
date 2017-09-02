package br.com.grahl.clientes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.grahl.clientes.domain.Pedido;

@Service
@Profile({"test", "dev"})
public class VoidPedidoService implements PedidoService {

	@Override
	public List<Pedido> getPedidosByIdCliente(String idCliente) {
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		Pedido pedido = new Pedido();
		pedido.setId("1");
		pedido.setIdCliente("1");
		pedido.setValor(123.4);
		
		pedidos.add(pedido);
		
		Pedido pedido2 = new Pedido();
		pedido2.setId("2");
		pedido2.setIdCliente("1");
		pedido2.setValor(555.3);
		
		pedidos.add(pedido2);
		
		return pedidos;
		
	}

}
