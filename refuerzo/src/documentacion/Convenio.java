package documentacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import persona.alumno;
import persona.tutor.tutorDocente;
import persona.tutor.tutorLaboral;

public class Convenio {
	
	private int id;
	private Empresa empresa;
	private int numAlunmosAcogidos;
	private List<alumno> alumnos;
	private LocalDate firmaLaboral;
	private LocalDate firmaDocente;
	private tutorLaboral tutorLaboralAlumno;
	private tutorDocente tutorDocenteSeguimiento;
	
	private int ultId = 1;

	public Convenio(Empresa empresa, int numAlunmosAcogidos) {
		
		if(empresa.getNumeroTrabajadores()<numAlunmosAcogidos*2 ) {
	    	throw new IllegalArgumentException("Hay mas alumnos de los trabajadores");
	    }
		this.id = ultId++;
		this.empresa = empresa;
		this.numAlunmosAcogidos = numAlunmosAcogidos;
		this.alumnos= new ArrayList<alumno>();
		this.firmaDocente= null;
		this.firmaLaboral= null;
		this.tutorLaboralAlumno= null;
		this.tutorDocenteSeguimiento= null;
		
	}
	public boolean completo() {
		return this.numAlunmosAcogidos==this.alumnos.size();
	}
	
	public void resumen() {
	 System.out.print("Estado: ");
	 if(this.firmaDocente != null && this.firmaLaboral != null) {
		 System.out.println("FIRMADO");
	 }else {
		 System.out.println("PENDIENTE");
	 }
	 System.out.println("alumnos: "+ this.numAlunmosAcogidos);
	 for(alumno a : this.alumnos) {
		 System.out.println("- "+ a.getApellido() + ", "+ a.getNombre());
	 }
	}
	 public void incluirAlumno(alumno a) {
		 
	 if(this.alumnos.contains(a)) {
		 throw new IllegalArgumentException("NO");
	 }
	 if(completo()) {
		 throw new IllegalArgumentException("NO");
	 }
	 if(this.firmaDocente != null && this.firmaLaboral != null) {
		 throw new IllegalArgumentException("NO");
	 }
		 this.alumnos.add(a);
	 }
	 
	 public void retirarAlumno() {
		 this.alumnos.remove(id);
		 if(id < 0 || id >= this.alumnos.size()) {
			 throw new IllegalArgumentException("NO");
		 }
		 if(this.firmaDocente != null && this.firmaLaboral != null) {
			 throw new IllegalArgumentException("NO");
		 }
		 
		 this.alumnos.remove(id);
	 }
	 
	 public void firmar(tutorDocente tutorDocente) {
		 if(this.firmaDocente !=null) {
			 throw new IllegalArgumentException("NO");
			 
		 }
		 if(!completo()) {
			 throw new IllegalArgumentException("NO");
		 }
		 this.firmaDocente = LocalDate.now();
		 this.tutorDocenteSeguimiento = tutorDocente;
		 
	 }
	 public void firmar(tutorLaboral tutorLaboral) {
		 if(this.firmaLaboral !=null) {
			 throw new IllegalArgumentException("NO");
			 
		 }
		 if(!completo()) {
			 throw new IllegalArgumentException("NO");
		 }
		 this.firmaLaboral = LocalDate.now();
		 this.tutorLaboralAlumno = tutorLaboral;
		 
	 }
	
}
