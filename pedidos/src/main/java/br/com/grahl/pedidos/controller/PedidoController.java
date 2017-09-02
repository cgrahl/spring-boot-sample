package br.com.grahl.pedidos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grahl.pedidos.domain.Pedido;
import br.com.grahl.pedidos.service.PedidoService;

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
	
	@RequestMapping("/pedidos/clientes/{idCliente}")
	public List<Pedido> getAllByidCliente(@PathVariable(value="idCliente") String idCliente) {
		return pedidoService.getAllByIdCliente(idCliente);
	}

}
