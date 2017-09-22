package edu.toure.microservices.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Centralized configuration server, which manages external properties for all services
 *
 * @author touré
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

  public static void main(String[] args) {
    SpringApplication.run(ConfigServer.class, args);
  }
}
