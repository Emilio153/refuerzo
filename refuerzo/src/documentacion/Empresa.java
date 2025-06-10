package documentacion;

public class Empresa implements Contratable, Comparable<Empresa>{
	private String nombre;
	private String cif;
	private int numeroTrabajadores;
	private String direccion;
	private String localidad;
	
	private static String ultCif = "";

	public Empresa(String nombre, String cif, int numeroTrabajadores, String direccion, String localidad) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.numeroTrabajadores = numeroTrabajadores;
		this.direccion = direccion;
		this.localidad = localidad;
		
		ultCif = this.cif;
	}
	public int getNumeroTrabajadores() {
		return this.numeroTrabajadores;
	}
	
	public void setNumeroTrabajadores(int numeroTrabajadores) {
		if(numeroTrabajadores<2) {
			throw new IllegalArgumentException("No puede tener menos de dos trabajadores");
			
		}
	}
	@Override
	public void contratar(int cantidad) {
		this.numeroTrabajadores += cantidad;
		
	}
	@Override
	public void despedir(int cantidad) {
		 if(this.numeroTrabajadores- cantidad<2){	 
		 throw new IllegalArgumentException("La cantidad supera los limites");
		 }
	}
	@Override
	public int compareTo(Empresa o) {
		int result = o.numeroTrabajadores - this.numeroTrabajadores;
		
		if(result == 0) {
			result= this.cif.compareTo(o.cif);
		}
		return 0;
	}

}
