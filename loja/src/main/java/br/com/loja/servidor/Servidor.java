package br.com.loja.servidor;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		URI uri = URI.create("http://localhost:8080/");
		ResourceConfig config = new ResourceConfig().packages("br.com.loja");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		
		System.out.println("Server is running");
		System.out.println("Press enter to stop it");
		System.in.read();
		System.out.println("Stopping server");
		server.stop();
	}
}
