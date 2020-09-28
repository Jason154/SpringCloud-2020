package com.jason.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jason
 * @create 2020-09-21 19:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
  private Long id;
  private String serial;
}
