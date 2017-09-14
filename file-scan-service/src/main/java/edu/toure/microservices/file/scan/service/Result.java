package edu.toure.microservices.file.scan.service;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Scan result
 *
 * @author touré
 */
public class Result {

  private final String md5;
  private final Status status;
  private final long timestamp;

  public Result(String md5) {
    this.md5 = checkNotNull(md5);
    status = Status.UNKNOWN;
    timestamp = System.currentTimeMillis();
  }

  public String getMd5() {
    return md5;
  }

  public Status getStatus() {
    return status;
  }

  public long getTimestamp() {
    return timestamp;
  }
}
