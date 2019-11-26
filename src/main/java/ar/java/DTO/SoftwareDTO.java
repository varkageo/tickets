package ar.java.DTO;

public class SoftwareDTO {
	
	Integer id;
	String nombreSoft, empresa;
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
	public String getNombreSoft() {
		return nombreSoft;
	}
	public void setNombreSoft(String nombreSoft) {
		this.nombreSoft = nombreSoft;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	

}
