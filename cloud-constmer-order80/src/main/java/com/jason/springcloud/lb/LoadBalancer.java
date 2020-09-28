package com.jason.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Jason
 * @create 2020-09-26 11:22
 */
public interface LoadBalancer {
  ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
