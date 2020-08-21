package com.santandertech.inyecciondep.webapp.models.services;

public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante complejo...";
	}

}
