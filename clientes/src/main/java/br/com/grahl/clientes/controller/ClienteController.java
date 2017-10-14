package br.com.grahl.clientes.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grahl.clientes.service.PedidoService;
import br.com.grahl.pojos.Pedido;

@RestController
public class ClienteController {
	
	private PedidoService pedidoService;
	
	@Autowired
	public void setPedidoService(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	

	@RequestMapping("/anon/")
	public String getAll() {
		System.out.println("getAll");
		return "Lista com todos os clientes";
	}
	
	@RequestMapping("/cliente/{idCliente}/pedidos")
	public List<Pedido> getPedidosCliente(@PathVariable(value="idCliente")  String idCliente, @RequestHeader(value="Authorization") String authorizationHeader,
	        Principal currentUser) {
		System.out.println(currentUser.getName());
		return pedidoService.getPedidosByIdCliente(idCliente);
	}

}
