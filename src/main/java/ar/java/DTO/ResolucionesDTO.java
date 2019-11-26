package ar.java.DTO;

public class ResolucionesDTO {
	
	Integer id;
	Integer tickets_id;
	String detalle;
	Boolean resuelto;
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
	public Integer getTickets_id() {
		return tickets_id;
	}
	public void setTickets_id(Integer tickets_id) {
		this.tickets_id = tickets_id;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Boolean getResuelto() {
		return resuelto;
	}
	public void setResuelto(Boolean resuelto) {
		this.resuelto = resuelto;
	}
	

}
