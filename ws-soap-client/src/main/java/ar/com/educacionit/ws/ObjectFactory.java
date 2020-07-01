
package ar.com.educacionit.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.educacionit.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InternalServerError_QNAME = new QName("http://ws.educacionit.com.ar/", "InternalServerError");
    private final static QName _GetProductoByCodigo_QNAME = new QName("http://ws.educacionit.com.ar/", "getProductoByCodigo");
    private final static QName _CreateProductoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "createProductoResponse");
    private final static QName _DeleteProducto_QNAME = new QName("http://ws.educacionit.com.ar/", "deleteProducto");
    private final static QName _GetProductoByCodigoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "getProductoByCodigoResponse");
    private final static QName _CreateProducto_QNAME = new QName("http://ws.educacionit.com.ar/", "createProducto");
    private final static QName _FindAllProductosResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "findAllProductosResponse");
    private final static QName _UpdateProductoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "updateProductoResponse");
    private final static QName _UpdateProducto_QNAME = new QName("http://ws.educacionit.com.ar/", "updateProducto");
    private final static QName _DeleteProductoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "deleteProductoResponse");
    private final static QName _FindAllProductos_QNAME = new QName("http://ws.educacionit.com.ar/", "findAllProductos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.educacionit.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateProducto }
     * 
     */
    public UpdateProducto createUpdateProducto() {
        return new UpdateProducto();
    }

    /**
     * Create an instance of {@link DeleteProductoResponse }
     * 
     */
    public DeleteProductoResponse createDeleteProductoResponse() {
        return new DeleteProductoResponse();
    }

    /**
     * Create an instance of {@link FindAllProductos }
     * 
     */
    public FindAllProductos createFindAllProductos() {
        return new FindAllProductos();
    }

    /**
     * Create an instance of {@link FindAllProductosResponse }
     * 
     */
    public FindAllProductosResponse createFindAllProductosResponse() {
        return new FindAllProductosResponse();
    }

    /**
     * Create an instance of {@link UpdateProductoResponse }
     * 
     */
    public UpdateProductoResponse createUpdateProductoResponse() {
        return new UpdateProductoResponse();
    }

    /**
     * Create an instance of {@link CreateProducto }
     * 
     */
    public CreateProducto createCreateProducto() {
        return new CreateProducto();
    }

    /**
     * Create an instance of {@link DeleteProducto }
     * 
     */
    public DeleteProducto createDeleteProducto() {
        return new DeleteProducto();
    }

    /**
     * Create an instance of {@link GetProductoByCodigoResponse }
     * 
     */
    public GetProductoByCodigoResponse createGetProductoByCodigoResponse() {
        return new GetProductoByCodigoResponse();
    }

    /**
     * Create an instance of {@link GetProductoByCodigo }
     * 
     */
    public GetProductoByCodigo createGetProductoByCodigo() {
        return new GetProductoByCodigo();
    }

    /**
     * Create an instance of {@link CreateProductoResponse }
     * 
     */
    public CreateProductoResponse createCreateProductoResponse() {
        return new CreateProductoResponse();
    }

    /**
     * Create an instance of {@link InternalServerError }
     * 
     */
    public InternalServerError createInternalServerError() {
        return new InternalServerError();
    }

    /**
     * Create an instance of {@link CreateProductoDTO }
     * 
     */
    public CreateProductoDTO createCreateProductoDTO() {
        return new CreateProductoDTO();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link TipoProducto }
     * 
     */
    public TipoProducto createTipoProducto() {
        return new TipoProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServerError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "InternalServerError")
    public JAXBElement<InternalServerError> createInternalServerError(InternalServerError value) {
        return new JAXBElement<InternalServerError>(_InternalServerError_QNAME, InternalServerError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductoByCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "getProductoByCodigo")
    public JAXBElement<GetProductoByCodigo> createGetProductoByCodigo(GetProductoByCodigo value) {
        return new JAXBElement<GetProductoByCodigo>(_GetProductoByCodigo_QNAME, GetProductoByCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "createProductoResponse")
    public JAXBElement<CreateProductoResponse> createCreateProductoResponse(CreateProductoResponse value) {
        return new JAXBElement<CreateProductoResponse>(_CreateProductoResponse_QNAME, CreateProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "deleteProducto")
    public JAXBElement<DeleteProducto> createDeleteProducto(DeleteProducto value) {
        return new JAXBElement<DeleteProducto>(_DeleteProducto_QNAME, DeleteProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductoByCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "getProductoByCodigoResponse")
    public JAXBElement<GetProductoByCodigoResponse> createGetProductoByCodigoResponse(GetProductoByCodigoResponse value) {
        return new JAXBElement<GetProductoByCodigoResponse>(_GetProductoByCodigoResponse_QNAME, GetProductoByCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "createProducto")
    public JAXBElement<CreateProducto> createCreateProducto(CreateProducto value) {
        return new JAXBElement<CreateProducto>(_CreateProducto_QNAME, CreateProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "findAllProductosResponse")
    public JAXBElement<FindAllProductosResponse> createFindAllProductosResponse(FindAllProductosResponse value) {
        return new JAXBElement<FindAllProductosResponse>(_FindAllProductosResponse_QNAME, FindAllProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "updateProductoResponse")
    public JAXBElement<UpdateProductoResponse> createUpdateProductoResponse(UpdateProductoResponse value) {
        return new JAXBElement<UpdateProductoResponse>(_UpdateProductoResponse_QNAME, UpdateProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "updateProducto")
    public JAXBElement<UpdateProducto> createUpdateProducto(UpdateProducto value) {
        return new JAXBElement<UpdateProducto>(_UpdateProducto_QNAME, UpdateProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "deleteProductoResponse")
    public JAXBElement<DeleteProductoResponse> createDeleteProductoResponse(DeleteProductoResponse value) {
        return new JAXBElement<DeleteProductoResponse>(_DeleteProductoResponse_QNAME, DeleteProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "findAllProductos")
    public JAXBElement<FindAllProductos> createFindAllProductos(FindAllProductos value) {
        return new JAXBElement<FindAllProductos>(_FindAllProductos_QNAME, FindAllProductos.class, null, value);
    }

}
