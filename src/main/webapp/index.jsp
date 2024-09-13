<%@ page import="com.arquitecturajava.json1.Persona" %>
<%@ page import="com.arquitecturajava.json1.LeerJsonPersona" %>
<%@ page import="com.fasterxml.jackson.core.JsonProcessingException" %>

<html>
<body>
<h2>Hello World!</h2>
<p>
<%
        String json = "{\"nombre\": \"pedro\"}";
        LeerJsonPersona leerJsonPersona = new LeerJsonPersona();
        try {
            Persona persona = leerJsonPersona.getPersona(json);
            out.println(persona.getNombre());
        } catch (JsonProcessingException e) {
            out.println("Se ha producido un error al leer el json.");
        }
%>
</p>
</body>
</html>
