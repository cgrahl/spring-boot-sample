package br.com.grahl.clientes.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.grahl.pojos.Pedido;

@FeignClient(name="pedidos")
public interface PedidosServiceProxy {
	
	@RequestMapping(method=RequestMethod.GET, value="/pedidos/clientes/{idCliente}")
	List<Pedido> getAllByidCliente(@PathVariable(value="idCliente") String idCliente);


}
