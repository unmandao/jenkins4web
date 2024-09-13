package com.arquitecturajava.json1;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Principal {

    public static void main(String[] args) {
        String json = "{\"nombre\": \"pedro\"}";
        LeerJsonPersona leerJsonPersona = new LeerJsonPersona();
        try {
            Persona persona = leerJsonPersona.getPersona(json);
            System.out.println(persona.getNombre());
        } catch (JsonProcessingException e) {
            System.out.println("Se ha producido un error al leer el json.");
        }
    }
}
