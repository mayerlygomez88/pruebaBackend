package com.services.registro;

import registro.com.RegistroWSDL.RegistroRequest;
import registro.com.RegistroWSDL.RegistroResponse;

public class Validacion {
	public static RegistroResponse validar(RegistroRequest request) {
		RegistroResponse response = new RegistroResponse();
		String canal = request.getCanal().toUpperCase();
		if(canal.isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Canal es requerido");
		}
		if(!canal.contains("ECO")) {
			response.setCode("ER001");
			response.setMensaje("Codigo de canal no valido");
		}
		if(request.getCodigotrs().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Codigotrs es requerido");
		}
		if(request.getDate().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Date es requerido");
		}
		if(request.getIdservice().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Idservice es requerido");
		}
		if(request.getVrs().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Vrs es requerido");
		}
		if(request.getName().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Name es requerido");
		}
		if(request.getPassword().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Password es requerido");
		}
		if(request.getEmail().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Email es requerido");
		}
		if(request.getRol().isEmpty()) {
			response.setCode("ER004");
			response.setMensaje("Campo Rol es requerido");
		}
		return response;
	}

}
