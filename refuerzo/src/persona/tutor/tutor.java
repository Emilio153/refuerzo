package persona.tutor;

import persona.persona;

public abstract class tutor extends persona {
	
	private String email;
	
	public tutor(String nombre, String apellido, String dni, String email) {
		super(nombre,apellido,dni);
		this.email = email;
	}

}
