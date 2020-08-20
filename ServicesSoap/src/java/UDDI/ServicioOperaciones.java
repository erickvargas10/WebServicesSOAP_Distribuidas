/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author WENDY
 */
@WebService(serviceName = "ServicioOperaciones")
public class ServicioOperaciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
   @WebMethod(operationName = "suma")
   
    public double suma (@WebParam(name = "a") double a, @WebParam(name = "b") double b){
        return a+b;
    }
}
