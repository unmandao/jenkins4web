package com.arquitecturajava.json1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeerJsonPersona {

    public Persona getPersona(String json) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(json);
        String nombre = jsonNode.get("nombre").asText();

        return new Persona(nombre);
    }
}
