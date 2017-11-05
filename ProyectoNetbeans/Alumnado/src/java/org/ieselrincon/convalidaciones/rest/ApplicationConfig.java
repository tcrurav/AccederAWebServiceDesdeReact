/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ieselrincon.convalidaciones.rest;

import com.sun.net.httpserver.HttpServer;
import java.net.URI;
import java.util.Set;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Tiburcio
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        
//        final ResourceConfig resourceConfig = new ResourceConfig();
//        resourceConfig.register(new CORSFilter());
//        final final URI uri = "http://localhost:8080/Alumnado/webresources/ciclo";
//        final HttpServer httpServer = GrizzlyHttpServerFactory.createHttpServer(uri, resourceConfig);
        
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.ieselrincon.convalidaciones.rest.CicloResource.class);
    }
    
}
