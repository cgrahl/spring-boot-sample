package br.com.grahl.pedidos.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grahl.pedidos.service.PedidoService;
import br.com.grahl.pojos.Pedido;

@RestController
public class PedidoController {
	
	private PedidoService pedidoService;
	
	@Autowired
	public void setPedidoService(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@RequestMapping("/")
	public List<Pedido> getAll() {
		List<Pedido> result = new ArrayList<Pedido>();
		pedidoService.getAll().forEach(result::add);
		return result;
	}	
	
	@GetMapping("/pedidos/clientes/{idCliente}")
	public List<Pedido> getAllByidCliente(@PathVariable(value="idCliente") String idCliente) {
		return pedidoService.getAllByIdCliente(idCliente);
	}

}
