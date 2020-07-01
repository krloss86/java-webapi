package ar.com.educacionit.ws.dto;

public class CreateProductoDTO {

	private String descripcion;
	
	private Float precio;
	
	private String codigo;
	
	private Long tipoProducto;

	public CreateProductoDTO() {
		
	}
	
	public CreateProductoDTO(String descripcion, Float precio, String codigo, Long tipoProducto) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
		this.tipoProducto = tipoProducto;
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

	public Long getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(Long tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	@Override
	public String toString() {
		return "CreateProductoDTO [descripcion=" + descripcion + ", precio=" + precio + ", codigo=" + codigo
				+ ", tipoProducto=" + tipoProducto + "]";
	}
}
