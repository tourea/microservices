package edu.toure.microservices.file.scan.service;

import com.google.gson.Gson;

/**
 * Checks a file for vulnerabilities
 *
 * @author touré
 */
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
