package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jason
 * @create 2020-09-26 9:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8080 {
  public static void main(String[] args) {
    SpringApplication.run(OrderConsulMain8080.class, args);
  }
}
