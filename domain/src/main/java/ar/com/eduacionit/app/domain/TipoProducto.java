package ar.com.eduacionit.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity
 * @author CX PC
 *
 */
@Entity
@Table(name = "tipo_producto")
public class TipoProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 50, nullable = false)
	private String descripcion;

	public TipoProducto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoProducto [id=" + id + ", descripcion=" + descripcion + "]";
	}
		
}
