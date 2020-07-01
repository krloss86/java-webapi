package ar.com.educacionit.ws.dto;

import java.io.Serializable;

public class CreateProductoDTO implements Serializable {

	private static final long serialVersionUID = -908939929853007806L;

	private String descripcion;
	
	private Float precio;
	
	private String codigo;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
