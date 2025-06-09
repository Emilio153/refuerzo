package persona.tutor;

import persona.enums.Especialidad;

public class tutorDocente extends tutor{
	
	private Especialidad especialidad;
	
	
	public tutorDocente(String nombre, String apellido, String dni, String email, String especialidad) {
		super(nombre, apellido, dni, email);
			this.especialidad = Especialidad.valueOf(especialidad.toUpperCase());
		}
	
	
}
