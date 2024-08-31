/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.edu.umg.wsumg;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

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
    @Path("pruebaUMG")
    @Produces(MediaType.TEXT_PLAIN)
    public String pruebaUMG (){
        System.out.println("Entrando a consumir pruebaUMG");
        return "Hola mundo WS y los de la UMG tambien";
    }
}

//localhost:8080/WSUMG/webresources/WSUMGH/pruebaUMG