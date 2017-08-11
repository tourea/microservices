package edu.toure.microservices.file.scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File Scan Application
 *
 * @author touré
 */
@RestController
@SpringBootApplication
public class FileScanApplication {

  static final String API_VERSION = "/api/v1/";

  @RequestMapping(value = API_VERSION + "scan/file")
  public String scanFile() {
    return "path";
  }

  @RequestMapping(value = API_VERSION + "/check/md5")
  public String checkMd5() {
    return "md5";
  }

  public static void main(String[] args) {
    SpringApplication.run(FileScanApplication.class, args);
  }
}
