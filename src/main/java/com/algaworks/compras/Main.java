package com.algaworks.compras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.algaworks.compras.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Checkout c1 =context.getBean(Checkout.class);
		c1.finalizar();
		Checkout c2 =context.getBean(Checkout.class);
		c2.finalizar();
		Checkout c3 =context.getBean(Checkout.class);
		c3.finalizar();
		
		System.out.println(c1.getQtdPedidosFinalizado());
		
		((ConfigurableApplicationContext) context).close();
	}
}
