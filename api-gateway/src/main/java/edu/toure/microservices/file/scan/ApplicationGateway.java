package edu.toure.microservices.file.scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * API Gateway
 *
 * @author touré
 */
@EnableZuulProxy
@SpringBootApplication
public class ApplicationGateway {
  public static void main(String[] args) {
    SpringApplication.run(ApplicationGateway.class, args);
  }
}
