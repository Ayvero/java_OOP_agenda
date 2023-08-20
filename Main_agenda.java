package agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main_agenda {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		
		Contacto A= new Contacto("Alvarez", "555888", "alvarez-gmail");
		Contacto B= new Contacto("Baez", "555888", "baez-gmail");
		Contacto C= new Contacto("Cortes", "555888", "cortez-gmail");
		
		Participante part1= new Participante(A);
		Participante part2= new Participante(B);
		Participante part3= new Participante(C);
		
		LocalDateTime inicio1 = LocalDateTime.of(2023, 8, 20, 14, 30);
		LocalDateTime fin1 = LocalDateTime.of(2023, 8, 20, 16, 30);
		Reunion reunion1= new Reunion( "Tandil", "sotware", 120,inicio1,fin1);
		
		LocalDateTime inicio2 = LocalDateTime.of(2023, 8, 20, 15, 30);
		LocalDateTime fin2 = LocalDateTime.of(2023, 8, 20, 17, 30);
		Reunion reunion2= new Reunion( "Tandil", "IA", 120,inicio2,fin2);
		
		LocalDateTime inicio3 = LocalDateTime.of(2023, 8, 20, 16, 30);
		LocalDateTime fin3 = LocalDateTime.of(2023, 8, 20, 18, 30);
		Reunion reunion3= new Reunion( "Tandil", "SQL", 120, inicio3,fin3);
		
		reunion1.agregarParticipante(part1);
		reunion1.agregarParticipante(part2);
		reunion1.agregarParticipante(part3);
		
		reunion2.agregarParticipante(part1);
		reunion2.agregarParticipante(part2);
		reunion2.agregarParticipante(part3);
		
		reunion3.agregarParticipante(part1);
		reunion3.agregarParticipante(part2);
		reunion3.agregarParticipante(part3);
		
		
		Agenda agenda1= new Agenda();
		agenda1.agregarReunion(reunion1);
		agenda1.agregarReunion(reunion2);
		agenda1.agregarReunion(reunion3);
		
		
		
		
		
		
		System.out.println("Cantidad de participantes de la reunion 1: " + reunion1.getCantParticipantes()+ " , que se llevara a cabo en : " + reunion1.getUbicacion());
		
		if (reunion2.getInicio().isBefore(reunion1.getFin())) {
		    System.out.println("se superponen los horarios de la reunion 1 y la 2 : la reunion 1 tiene el siguiente horario: " + reunion1.getInicio()
		    +" y el siguiente fin: " + reunion1.getFin()+ " y la reunion 2 : \n " + reunion2.getInicio()+ " y la siguiente finalizacion: " + reunion2.getFin());
		}
		




		
		

	}

}
