package edu.toure.microservices.file.scan.service;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;

/**
 * Checks a file for vulnerabilities
 *
 * @author touré
 */
@Service
public class FileScanService {

  private final Gson gson;

  public FileScanService() {
    gson = new Gson();
  }

  public String check() {
    return gson.toJson(new Result("DEADBEEF"));
  }

  public String scan() {
    return gson.toJson(new Result("DEADBEEF"));
  }
}
