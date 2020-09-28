package com.jason.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jason
 * @create 2020-09-21 19:55
 */
@Configuration
public class ApplicationContextConfig {
  @Bean
  //开启负载均衡
  //@LoadBalanced
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
