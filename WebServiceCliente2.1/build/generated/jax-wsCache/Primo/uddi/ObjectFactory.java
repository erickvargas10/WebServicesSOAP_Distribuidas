
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
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

    private final static QName _Primo_QNAME = new QName("http://UDDI/", "primo");
    private final static QName _PrimoResponse_QNAME = new QName("http://UDDI/", "primoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Primo_Type }
     * 
     */
    public Primo_Type createPrimo_Type() {
        return new Primo_Type();
    }

    /**
     * Create an instance of {@link PrimoResponse }
     * 
     */
    public PrimoResponse createPrimoResponse() {
        return new PrimoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Primo_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "primo")
    public JAXBElement<Primo_Type> createPrimo(Primo_Type value) {
        return new JAXBElement<Primo_Type>(_Primo_QNAME, Primo_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "primoResponse")
    public JAXBElement<PrimoResponse> createPrimoResponse(PrimoResponse value) {
        return new JAXBElement<PrimoResponse>(_PrimoResponse_QNAME, PrimoResponse.class, null, value);
    }

}
