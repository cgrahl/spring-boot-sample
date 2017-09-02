package br.com.grahl.clientes.service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import br.com.grahl.pojos.Pedido;

@Service
@Profile("prod")
public class RuntimePedidoService implements PedidoService {

	@Override
	public List<Pedido> getPedidosByIdCliente(String idCliente) {
		// TODO Aqui faz a chamada http para o serviço real
		return null;
	}

}
