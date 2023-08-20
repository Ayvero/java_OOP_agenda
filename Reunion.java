package agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reunion {

	    private String ubicacion;
	    private List<Participante> participantes;
	    private String tema;
	    private int duracion; // en minutos
	    private LocalDateTime inicio;
	    private LocalDateTime fin;
	    
	    
	    
	    public Reunion(String ubicacion, String tema, int duracion, LocalDateTime inicio,LocalDateTime fin) {
	        this.ubicacion = ubicacion;
	        this.participantes = new ArrayList<>();
	        this.tema = tema;
	        this.duracion = duracion;
	        this.inicio=inicio;
	        this.fin=fin;
	        
	    }

	    public void agregarParticipante(Participante participante) {
	        participantes.add(participante);
	    }
	    
	    
	    

	    // Otros métodos y getters
	    
	    public List <Participante> getParticipante(){
	    	return participantes;
	    }
	    
	    
	    public int getCantParticipantes() {
	    	return participantes.size();
	    }
	    
	    
	    public String getUbicacion() {
	    	return ubicacion;
	    }
	    
	    public LocalDateTime getInicio() {
	    	return inicio;
	    }
	    
	    public LocalDateTime getFin() {
	    	return fin;
	    }
	    
	    
	}




	
	
	
	
	
	

