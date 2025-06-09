package persona.tutor;

import persona.enums.Cargo;

public class tutorLaboral extends tutor{
	private Cargo cargo;
	
	public tutorLaboral(String nombre,String apellido,String dni,String email, String cargo) {
		super(nombre,apellido,dni,email);
		this.cargo = Cargo.valueOf(cargo);
	}

}
