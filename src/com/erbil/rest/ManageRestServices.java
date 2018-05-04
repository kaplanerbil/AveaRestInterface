package com.erbil.rest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

import javax.ws.rs.core.UriBuilder;

import com.erbil.rest.spark.SparkServices;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

// import static JsonUtil.*;

public class ManageRestServices {

	public static void main(String[] args) {
		
		// java spark services
//		new RestServiceHub1(new RestServicesForXGroup());
		
		
		// manual publish via SimpleServer
		
		try {
			createHttpServer().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		new SparkServices();
		
//		java.io.Closeable server = null;
//	    try {
//	        // Creates a server and listens on the address below.
//	        // Scans classpath for JAX-RS resources
//	        server = SimpleServerFactory.create("");
//	        System.out.println("Press any key to stop the service...");
//	        System.in.read();
//	    } catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//	        try {
//	            if (server != null) {
//	                server.close();
//	            }
//	        } catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//	            ;
//	        }
//	    }
		
	}
	
	private static HttpServer createHttpServer() throws IOException {
        ResourceConfig config = new PackagesResourceConfig("com.erbil.rest.jersey");
        // This tutorial required and then enable below line: http://crunchify.me/1VIwInK
        //config.getContainerResponseFilters().add(MyCORSFilter.class);
        return HttpServerFactory.create(getURI(), config);
    }

	
    private static URI getURI() {
        return UriBuilder.fromUri("http://" + getHostName() + "/").port(8085).build();
    }
 
    private static String getHostName() {
        String hostName = "localhost";
        try {
            hostName = InetAddress.getLocalHost().getCanonicalHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostName;
    }

}