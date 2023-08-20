package agenda;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Reunion> reuniones;

	    public Agenda() {
	        this.reuniones = new ArrayList<>();
	    }

	    public void agregarReunion(Reunion reunion) {
	        reuniones.add(reunion);
	    }
	    
	    
}
