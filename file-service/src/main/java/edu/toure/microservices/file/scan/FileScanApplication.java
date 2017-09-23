package edu.toure.microservices.file.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
public class FileScanApplication {

  private static final String API_VERSION_1 = "/api/v1/";

  @Autowired
  private FileScanService service;

  @RequestMapping(value = API_VERSION_1 + "/scan")
  public String scan() {
    return service.scan(/*file*/);
  }

  @RequestMapping(value = API_VERSION_1 + "/check")
  public String check() {
    return service.check(/*md5*/);
  }

  public static void main(String[] args) {
    SpringApplication.run(FileScanApplication.class, args);
  }
}
