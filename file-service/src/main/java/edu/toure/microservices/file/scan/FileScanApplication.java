package edu.toure.microservices.file.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.toure.microservices.file.scan.service.FileScanService;

/**
 * File Scan Application
 *
 * @author touré
 */
@RestController
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableFeignClients
@Configuration
@ComponentScan
public class FileScanApplication {

  @Autowired
  private FileScanService service;

  @RequestMapping(value = "/scan")
  public String scan() {
    return service.scan(/*file*/);
  }

  @RequestMapping(value = "/check")
  public String check() {
    return service.check(/*md5*/);
  }

  public static void main(String[] args) {
    SpringApplication.run(FileScanApplication.class, args);
  }
}
