package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author Jason
 * @create 2020-09-24 17:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain8080 {
  public static void main(String[] args) {
    SpringApplication.run(OrderZKMain8080.class, args);
  }
}
