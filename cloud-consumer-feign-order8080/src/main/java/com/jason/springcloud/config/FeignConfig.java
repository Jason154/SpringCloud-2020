package com.jason.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/**
 * @author Jason
 * @create 2020-09-26 19:57
 */
@Configuration
public class FeignConfig {
  @Bean
  Logger.Level feignLoggerLevel(){
    return Logger.Level.FULL;
  }
}
