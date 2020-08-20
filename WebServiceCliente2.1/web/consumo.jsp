
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>      
        
        <form action="consumo.jsp" method="POST">
            <div class="form-group">
                <label for="txt_nombre">Primer Numero</label>
                <input type="text" name="txt_numl"/>
                
                <label for="txt_nombre">Segundo Numero</label>
                <input type="text" name="txt_num2"/>       
                
                
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary"> Enviar datos</button>                
            </div>
              
            
            
        </form>
            <%! String s_num1, s_num2;%>
            
        <%s_num1= request.getParameter("txt_num1");%>
        <%s_num2= request.getParameter("txt_num2");%>                
        
      </body>
</html>  
    
    <%-- start web service invocation --%>
    <hr/>
    
    <%
    try {
	uddi.ServicioOperaciones_Service service = new uddi.ServicioOperaciones_Service();
	uddi.ServicioOperaciones port = service.getServicioOperacionesPort();
	 // TODO initialize WS operation arguments here
	double a = Double.parseDouble(s_num1);
	double b = Double.parseDouble(s_num2);
	// TODO process result here
	double result = port.suma(a, b);
        System.out.println("resultado:"+result);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
