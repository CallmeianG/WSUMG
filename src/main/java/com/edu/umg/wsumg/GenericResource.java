/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.edu.umg.wsumg;

import com.edu.umg.dpbase64.DpBase64_codificar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;
import java.util.Base64;

/**
 * REST Web Service
 *
 * @author Mayela
 */
@Path("WSUMGH")
@RequestScoped
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }

    @GET
    @Path("/pruebaUMG")
    @Produces(MediaType.TEXT_PLAIN)
    public String pruebaUMG() {
        System.out.println("Entrando a consumir pruebaUMG");
        
        // Crear JSON
        JSONObject json = new JSONObject();
        json.put("Nombre", "Ian");
        json.put("Apellido", "Garcia");
        String jsonString = json.toJSONString();
        
        
        
        
        DpBase64_codificar cof = new DpBase64_codificar();
        
        String encodedJson = cof.Codificar(json);
        
        return encodedJson;
    }
}


//localhost:8080/WSUMG/resources/WSUMGH/pruebaUMG