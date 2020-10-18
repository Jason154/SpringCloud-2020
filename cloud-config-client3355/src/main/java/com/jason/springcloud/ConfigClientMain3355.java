package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Jason
 * @create 2020-09-29 14:14
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
  public static void main(String[] args) {
    SpringApplication.run((ConfigClientMain3355.class), args);
  }
}
