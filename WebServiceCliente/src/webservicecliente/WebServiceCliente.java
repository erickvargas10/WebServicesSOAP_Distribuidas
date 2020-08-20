/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicecliente;

/**
 *
 * @author WENDY
 */

public class WebServiceCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("la suma es: "+suma(4,6));
        
        int numero= 4;
        
        System.out.println( primo (numero));
    }

    private static double suma(double a, double b) {
        uddi.ServicioOperaciones_Service service = new uddi.ServicioOperaciones_Service();
        uddi.ServicioOperaciones port = service.getServicioOperacionesPort();
        return port.suma(a, b);
    }

    private static String primo(int primo) {
        uddi.Primo_Service service = new uddi.Primo_Service();
        uddi.Primo port = service.getPrimoPort();
        return port.primo(primo);
    }
    
    
}
