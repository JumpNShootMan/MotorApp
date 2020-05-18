package pe.upc.motor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMotor;
	private String Modelo;
	private String Marca;
	private Double Precio;
	public Long getIdMotor() {
		return idMotor;
	}
	public void setIdMotor(Long idMotor) {
		this.idMotor = idMotor;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
	
}
