package com.jason.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jason
 * @create 2020-09-28 19:43
 */
@Configuration
public class GateWayConfig {
  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
    RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
    routes.route("path_route_jason",r -> r.path("/guonei").uri("http://news" +
            ".baidu.com/guonei")).build();
    return routes.build();
  }
}
