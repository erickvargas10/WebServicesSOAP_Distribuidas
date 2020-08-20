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
@WebService(serviceName = "Primo")
public class Primo { 
    
    @WebMethod(operationName = "primo")    
    public String primo(@WebParam(name = "primo") int a) {
        Verificar ver = new Verificar();
        if(ver.primo(a)==true){
            return"EL NUMERO ES PRIMO";
        }
        else{
            return "EL NUMERO NO ES PRIMO";
        }
        
        
    }
}