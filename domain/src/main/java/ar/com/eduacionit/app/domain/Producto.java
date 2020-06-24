package ar.com.eduacionit.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity
 * @author CX PC
 *
 */
@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 50, nullable = false)
	private String descripcion;
	
	@Column(name = "precio", nullable = false)
	private Float precio;
	
	@Column(name = "codigo", nullable = false, unique = true, length = 10)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "tipo_producto_id", referencedColumnName = "id", nullable = false)
	private TipoProducto tipoProducto;

	public Producto() {
		
	}
	
	public Producto(Long id, String descripcion, Float precio, String codigo) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Producto(String descripcion, Float precio, String codigo) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
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
	
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", codigo=" + codigo
				+ "]";
	}
	
}
