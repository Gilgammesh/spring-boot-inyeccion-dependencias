package com.santandertech.inyecciondep.webapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.santandertech.inyecciondep.webapp.models.domain.ItemFactura;
import com.santandertech.inyecciondep.webapp.models.domain.Producto;
import com.santandertech.inyecciondep.webapp.models.services.IServicio;
import com.santandertech.inyecciondep.webapp.models.services.MiServicio;
import com.santandertech.inyecciondep.webapp.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioBasico")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("Camara Sony", 100.00);
		Producto producto2 = new Producto("Televisor LG", 500.00);
		Producto producto3 = new Producto("Horno microondas", 200.00);
		Producto producto4 = new Producto("Teclado gamer", 50.00);

		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 1);
		ItemFactura item3 = new ItemFactura(producto3, 1);
		ItemFactura item4 = new ItemFactura(producto4, 3);

		return Arrays.asList(item1, item2, item3, item4);

	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Notebook Asus", 1000.00);
		Producto producto2 = new Producto("Impresora HP Multifuncional", 500.00);
		Producto producto3 = new Producto("Monitor LG Gamer", 800.00);
		Producto producto4 = new Producto("Escritorio Oficina", 250.00);

		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 1);
		ItemFactura item3 = new ItemFactura(producto3, 1);
		ItemFactura item4 = new ItemFactura(producto4, 3);

		return Arrays.asList(item1, item2, item3, item4);

	}

}
