package persona;

public abstract class persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	

	public persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		setDni(dni);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(dni == null || dni.length()<9) {
			throw new IllegalArgumentException("DNI no valido");
		}
		this.dni = dni;
	}
	
}
