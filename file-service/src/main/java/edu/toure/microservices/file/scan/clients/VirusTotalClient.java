package edu.toure.microservices.file.scan.clients;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author touré
 */
@FeignClient(name = "virustotal-service")
public interface VirusTotalClient {

  @RequestMapping(method = RequestMethod.PUT, value = "/virustotal/scan", consumes = APPLICATION_JSON_UTF8_VALUE)
  String scan();

  @RequestMapping(method = RequestMethod.PUT, value = "/virustotal/check", consumes = APPLICATION_JSON_UTF8_VALUE)
  String check();
}
