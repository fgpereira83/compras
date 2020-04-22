package com.algaworks.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Checkout {
	
	private int count;
	@Autowired
	private Impressora impressora;

	public void finalizar() {
		// regras do checkout
		impressora.imprimir("compras.csv");
		count++;
	}

	public int getQtdPedidosFinalizado() {
	return count;	
	}
}
