package br.com.grahl.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grahl.clientes.domain.Cliente;
import br.com.grahl.clientes.domain.Pedido;
import br.com.grahl.clientes.service.ClienteService;
import br.com.grahl.clientes.service.PedidoService;

@RestController
public class ClienteController {
	
	private ClienteService clienteService;
	
	@Autowired
	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	private PedidoService pedidoService;
	
	@Autowired
	public void setPedidoService(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@RequestMapping("/")
	public List<Cliente> getAll() {
		return clienteService.getAll();
	}
	
	@RequestMapping("/cliente/{idCliente}/pedidos")
	public List<Pedido> getPedidosCliente(@PathVariable(value="idCliente") String idCliente) {
		return pedidoService.getPedidosByIdCliente(idCliente);
	}

}
