package edu.toure.microservices.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Service Registry
 *
 * @author touré
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryServer {
  public static void main(String[] args) {
    SpringApplication.run(ServiceRegistryServer.class, args);
  }
}
