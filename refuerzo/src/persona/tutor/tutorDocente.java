package persona.tutor;

import persona.enums.Especialidad;

public class tutorDocente extends tutor{
	
	private Especialidad especialidad;
	
	
	public tutorDocente(String nombre, String apellido, String dni, String email, Especialidad especialidad) {
		super(nombre, apellido, dni, email);
			this.especialidad = especialidad;
		}
	
	public String getEspecialidad() {
		return this.especialidad.toString();
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
	
}
