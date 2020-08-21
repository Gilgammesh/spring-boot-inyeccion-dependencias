package com.santandertech.inyecciondep.webapp.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura implements Serializable{

	private static final long serialVersionUID = -1758328539605861968L;

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired
	private Cliente cliente;

	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> items;

	@PostConstruct
	public void incializar() {
		cliente.setNombre(cliente.getNombre() + " Enrique");
		setDescripcion(descripcion + " modificada");
	}

	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida : " + descripcion);
	}

	public Factura() {
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
