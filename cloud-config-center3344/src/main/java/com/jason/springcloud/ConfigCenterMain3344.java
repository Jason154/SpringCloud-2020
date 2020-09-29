package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Jason
 * @create 2020-09-28 23:46
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigCenterMain3344.class, args);
  }
}
