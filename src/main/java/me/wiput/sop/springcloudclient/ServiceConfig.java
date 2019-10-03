package me.wiput.sop.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

  @Value("${name.test}")
  private String message;

  public String getMessage() {
    return message;
  }
}
