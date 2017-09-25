package edu.toure.microservices.file.scan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import edu.toure.microservices.file.scan.clients.VirusTotalClient;

/**
 * Checks a file for vulnerabilities
 *
 * @author touré
 */
@Service
public class FileScanService {

  @Autowired
  private VirusTotalClient virusTotal;

  private final Gson gson;

  public FileScanService() {
    gson = new Gson();
  }

  @HystrixCommand(
      fallbackMethod = "defaultCheck",
      commandProperties = {
        @HystrixProperty(name = "hystrix.command.default.circuitBreaker.errorThresholdPercentage", value = "3")
      }
  )
  public String check() {
    return gson.toJson(new Result(virusTotal.check()));
  }

  @HystrixCommand
  public String defaultCheck() {
    return gson.toJson(new Result("DEADBEEF"));
  }

  @HystrixCommand(fallbackMethod = "defaultScan")
  public String scan() {
    return gson.toJson(new Result(virusTotal.scan()));
  }

  @HystrixCommand
  public String defaultScan() {
    return gson.toJson(new Result("DEADBEEF"));
  }
}
