package ar.java.Models;

import javax.persistence.*;

@Entity
public class Prioridades {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
