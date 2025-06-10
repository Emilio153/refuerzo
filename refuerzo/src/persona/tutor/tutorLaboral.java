package persona.tutor;

import persona.enums.Cargo;

public class tutorLaboral extends tutor{
	private Cargo cargo;
	
	public tutorLaboral(String nombre,String apellido,String dni,String email, String cargo) {
		super(nombre,apellido,dni,email);
		
	}
	
	public void setCargo(String cargo) {
		this.cargo = Cargo.valueOf(cargo);
	}
	
	public String getcargo() {
		return this.cargo.toString();
				
	}
	
	@Override
	public String toString() {
		String result= "Tutor Laboral \n";
		result +="Nombre: "+ this.getNombre()
		+ "Apellido: " + this.getApellido()
		+ "DNI: "+ this.getDni()
		+ "Email: " this.getEmail()
		+ "Cargo: " + this.getcargo();
	}

}
