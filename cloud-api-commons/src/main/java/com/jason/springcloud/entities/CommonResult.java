package com.jason.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jason
 * @create 2020-09-21 19:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
  private Integer code;
  private String message;
  private T data;

  public CommonResult(Integer code, String message) {
    this(code,message,null);
  }
}
