package com.services.registro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.services.connection.ConnectionBD;

import registro.com.RegistroWSDL.RegistroRequest;
import registro.com.RegistroWSDL.RegistroResponse;

public class HelperRegistro {
	public RegistroResponse insertar(RegistroRequest request) {
		
		RegistroResponse response = new RegistroResponse();
		// Establecer conexión con la base de datos
		  ConnectionBD conexion = new ConnectionBD();

		    try {
		    	 Connection con = conexion.getConnection();
				 String insetRegistro = "";
		         PreparedStatement st = con.prepareStatement(insetRegistro);

		         st.setString     (1, request.getName());
		         st.setString     (2, request.getPassword());
		         st.setString     (3, request.getEmail());
		         st.setString     (4, request.getRol().toString());
		         st.setString     (5, request.getDate());
		         
            
	            st.executeUpdate();

	            st.close();
	            con.close();

	            System.out.println("Llamada agregada con éxito a la base de datos.");
	            response.setCode("0000");
	            response.setMensaje("Registro Exitoso");
	           
	            return response;
	            
	        } catch (SQLException e) {
	        	System.out.println("Error!, el ususario no pudo ser agregado a la base de datos.");
	        }
		    response.setCode("ER124");
		    response.setMensaje("Error al ingresar los datos a la base de datos");
		    return response;
	    }


	}

