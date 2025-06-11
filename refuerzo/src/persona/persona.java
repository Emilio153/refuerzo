package persona;

public abstract class persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	

	public persona(String nombre, String apellido, String dni) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}

	public String getDni() {
		return  this.dni;
	}

	public void setDni(String dni) {
		if(dni == null || dni.length()<9) {
			throw new IllegalArgumentException("DNI no valido");
		}
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		String result ="Persona \n";
		result+="Nombre: "+this.getNombre() 
		+"Apellido: "+this.getApellido()
		+"DNI: "+this.getDni();
		return result;
	}
	
	public  void saludar() {
		System.out.println("Hola soy " + this.getNombre()+ " y soy " + this.getClass());
	}
	
}
