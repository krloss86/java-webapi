
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
    private final static QName _CreateNewProductoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "createNewProductoResponse");
    private final static QName _GetProductoByCodigoResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "getProductoByCodigoResponse");
    private final static QName _CreateNewProducto_QNAME = new QName("http://ws.educacionit.com.ar/", "createNewProducto");
    private final static QName _FindAllProductosResponse_QNAME = new QName("http://ws.educacionit.com.ar/", "findAllProductosResponse");
    private final static QName _FindAllProductos_QNAME = new QName("http://ws.educacionit.com.ar/", "findAllProductos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.educacionit.ws
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link GetProductoByCodigoResponse }
     * 
     */
    public GetProductoByCodigoResponse createGetProductoByCodigoResponse() {
        return new GetProductoByCodigoResponse();
    }

    /**
     * Create an instance of {@link CreateNewProducto }
     * 
     */
    public CreateNewProducto createCreateNewProducto() {
        return new CreateNewProducto();
    }

    /**
     * Create an instance of {@link CreateNewProductoResponse }
     * 
     */
    public CreateNewProductoResponse createCreateNewProductoResponse() {
        return new CreateNewProductoResponse();
    }

    /**
     * Create an instance of {@link GetProductoByCodigo }
     * 
     */
    public GetProductoByCodigo createGetProductoByCodigo() {
        return new GetProductoByCodigo();
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
     * Create an instance of {@link TipoProducto }
     * 
     */
    public TipoProducto createTipoProducto() {
        return new TipoProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "createNewProductoResponse")
    public JAXBElement<CreateNewProductoResponse> createCreateNewProductoResponse(CreateNewProductoResponse value) {
        return new JAXBElement<CreateNewProductoResponse>(_CreateNewProductoResponse_QNAME, CreateNewProductoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "createNewProducto")
    public JAXBElement<CreateNewProducto> createCreateNewProducto(CreateNewProducto value) {
        return new JAXBElement<CreateNewProducto>(_CreateNewProducto_QNAME, CreateNewProducto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.educacionit.com.ar/", name = "findAllProductos")
    public JAXBElement<FindAllProductos> createFindAllProductos(FindAllProductos value) {
        return new JAXBElement<FindAllProductos>(_FindAllProductos_QNAME, FindAllProductos.class, null, value);
    }

}
