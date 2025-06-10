package persona.tutor;

import persona.persona;

public abstract class tutor extends persona {
	
	private String email;
	
	public tutor(String nombre, String apellido, String dni, String email) {
		super(nombre,apellido,dni);
		this.email = email;
	}
	
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return this.email;
	}

}
