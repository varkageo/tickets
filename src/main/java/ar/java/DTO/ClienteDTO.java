package ar.java.DTO;

public class ClienteDTO {
	
	Integer id;
	String nombre, apellido, mail;
	Boolean borrado;
	
	
	public Boolean getBorrado() {
		return borrado;
	}
	public void setBorrado(Boolean borrado) {
		this.borrado = borrado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	


}
