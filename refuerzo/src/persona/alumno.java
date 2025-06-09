package persona;

public class alumno extends persona {
	private String nss;
	
	
	public alumno(String nombre, String apellido, String dni,String nss) {
		super(nombre, apellido, dni);
		setNss(nss);
	}


	public String getNss() {
		return nss;
	}


	public void setNss(String nss) {
		this.nss = nss;
	}
	
	

}
