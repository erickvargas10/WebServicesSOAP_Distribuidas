
package uddi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioOperaciones", targetNamespace = "http://UDDI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioOperaciones {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://UDDI/", className = "uddi.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://UDDI/", className = "uddi.HelloResponse")
    @Action(input = "http://UDDI/ServicioOperaciones/helloRequest", output = "http://UDDI/ServicioOperaciones/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://UDDI/", className = "uddi.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://UDDI/", className = "uddi.SumaResponse")
    @Action(input = "http://UDDI/ServicioOperaciones/sumaRequest", output = "http://UDDI/ServicioOperaciones/sumaResponse")
    public double suma(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

}
