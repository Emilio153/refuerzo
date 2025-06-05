package perosna;

public class tutorDocente extends persona{
	private String email;
	private Especialidad especialidad;
	
	
	public tutorDocente(String nombre, String apellido, String dni, String email, String especialidad) {
		super(nombre, apellido, dni);
			setEmail(email);
			setEspecialidad(especialidad);
		}
	
	public void setEmail(String email) {
		
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setEspecialidad(String especialidad) {
		
	}
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}
}
