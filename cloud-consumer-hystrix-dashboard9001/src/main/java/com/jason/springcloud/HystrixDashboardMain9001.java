package com.jason.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Jason
 * @create 2020-09-28 17:32
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardMain9001.class, args);
  }
}
