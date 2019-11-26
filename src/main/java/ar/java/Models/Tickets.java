package ar.java.Models;

import java.util.*;

import javax.persistence.*;

@Entity
public class Tickets {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	Integer software_id, cliente_id, prioridad_id;
	String descripcion;
	Date fecha_limte;
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
	public Integer getSoftware_id() {
		return software_id;
	}
	public void setSoftware_id(Integer software_id) {
		this.software_id = software_id;
	}
	public Integer getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}
	public Integer getPrioridad_id() {
		return prioridad_id;
	}
	public void setPrioridad_id(Integer prioridad_id) {
		this.prioridad_id = prioridad_id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_limte() {
		return fecha_limte;
	}
	public void setFecha_limte(Date fecha_limte) {
		this.fecha_limte = fecha_limte;
	}
	

}
