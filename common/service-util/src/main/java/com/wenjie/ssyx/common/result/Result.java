package com.wenjie.ssyx.common.result;

import lombok.Builder;

/**
 * @className: Result
 * @description: Result class for the whole project, which is used to return the result of the request to the front end
 * @author: Wenjie FU
 * @date: 13/01/2024
 **/

@Builder
public class Result<T> {
  private Integer code;
  private String message;
  private T data;

  // Define a private constructor to prevent instantiation of this class
  private Result() {
  }

  // Define a public static class to return a new instance of this class
  public static <T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
    return (Result<T>) Result
      .builder()
      .data(data)
      .code(resultCodeEnum.getCode())
      .message(resultCodeEnum.getMessage()).build();
  }

  public static <T> Result<T> ok(T data) {
    return build(data, ResultCodeEnum.SUCCESS);
  }

  public static <T> Result<T> fail(T data) {
    return build(data, ResultCodeEnum.FAIL);
  }


}
