package agenda;


import java.util.ArrayList;
import java.util.List;

public class Contacto {
	
	    private String nombre;
	    private String telefono;
	    private String email;
	    
	    public Contacto(String nombre, String telefono, String email) {
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.email = email;
	    }

	    // Getters y setters
	    
	    
	    public String getNombre() {
	     return nombre;
	    }
	    
	    
	    public String getTelefono() {
		     return telefono;
		    }
	    
	    public String getEmail() {
		     return email;
		    }
	}




