package edu.toure.microservices.file.scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.toure.microservices.file.scan.service.FileScanService;

/**
 * Spring configuration
 *
 * @author touré
 */
@Configuration
public class FileScanSpringConfig {

  @Bean
  public FileScanService fileScanService() {
    return new FileScanService();
  }
}
