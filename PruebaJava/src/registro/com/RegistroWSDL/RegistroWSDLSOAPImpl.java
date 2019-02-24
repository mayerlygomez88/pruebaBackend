/**
 * RegistroWSDLSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registro.com.RegistroWSDL;

import com.services.registro.HelperRegistro;
import com.services.registro.Validacion;

public class RegistroWSDLSOAPImpl implements registro.com.RegistroWSDL.RegistroWSDL_PortType{
    public registro.com.RegistroWSDL.RegistroResponse registro(registro.com.RegistroWSDL.RegistroRequest parameters) throws java.rmi.RemoteException {
        RegistroRequest request = new RegistroRequest();
    	RegistroResponse response = new RegistroResponse();
    	response = Validacion.validar(request);
    	if(!response.getCode().equals(null)) {
    		return response;
    	}
    	HelperRegistro helperRegistro = new HelperRegistro();
    	response = helperRegistro.insertar(request);
    	if(!response.getCode().equals("0000")) {
    		return response;
    	}
    	response.setName(request.getName());
    	response.setPasword(request.getPassword());
    	response.setEmail(request.getEmail());
    	
    	return response;
    }

}
