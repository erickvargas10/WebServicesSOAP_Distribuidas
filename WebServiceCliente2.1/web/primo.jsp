<%-- 
    Document   : primo.jsp
    Created on : 20/08/2020, 2:09:57
    Author     : WENDY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%! String s_num1;%>
        
       <form action="primo.jsp" method="POST">
            <div class="form-group">
                <label for="txt_nombre">Ingresa un Número</label>
                <input type="text" name="txt_numl"/>              
                
                
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary"> Enviar</button>                
            </div>
             
            
            
        </form>
        
            
        <%s_num1= request.getParameter("txt_num1");%>
    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	uddi.Primo_Service service = new uddi.Primo_Service();
	uddi.Primo port = service.getPrimoPort();
	 // TODO initialize WS operation arguments here
	int primo =Integer.parseInt(s_num1);;
	// TODO process result here
	java.lang.String result = port.primo(primo);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
