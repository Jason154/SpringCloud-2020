package com.jason.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jason
 * @create 2020-09-26 10:58
 */
@Configuration
public class MySelfRule {
  @Bean
  public IRule myRule(){
    return new RandomRule();
  }
}
