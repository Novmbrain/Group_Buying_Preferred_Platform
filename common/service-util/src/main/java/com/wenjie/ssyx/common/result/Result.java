package com.wenjie.ssyx.common.result;

import lombok.Data;

/**
 * @className: Result
 * @description: Result class for the whole project, which is used to return the result of the request to the front end
 * @author: Wenjie FU
 * @date: 13/01/2024
 **/

@Data
public class Result<T> {
  private Integer code;
  private String message;
  private T data;

  // Define a private constructor to prevent instantiation of this class
  private Result() {
  }

  // 设置数据,返回对象的方法
  public static <T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
    // 创建Resullt对象，设置值，返回对象
    Result<T> result = new Result<>();
    // 判断返回结果中是否需要数据
    if (data != null) {
      // 设置数据到result对象
      result.setData(data);
    }
    // 设置其他值
    result.setCode(resultCodeEnum.getCode());
    result.setMessage(resultCodeEnum.getMessage());
    // 返回设置值之后的对象
    return result;
  }

  public static <T> Result<T> ok(T data) {
    return build(data, ResultCodeEnum.SUCCESS);
  }

  public static <T> Result<T> fail(T data) {
    return build(data, ResultCodeEnum.FAIL);
  }


}
