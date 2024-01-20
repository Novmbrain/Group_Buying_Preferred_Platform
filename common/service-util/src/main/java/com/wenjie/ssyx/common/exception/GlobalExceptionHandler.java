package com.wenjie.ssyx.common.exception;

import com.wenjie.ssyx.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className: GloabalExceptionHandler
 * @description: TODO
 * @author: Wenjie FU
 * @date: 14/01/2024
 **/

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Result error(Exception e) {
    e.printStackTrace();
    return Result.fail(null);
  }

  @ExceptionHandler(CustomizedException.class)
  @ResponseBody
  public Result error(CustomizedException e) {
    e.printStackTrace();
    return Result.fail(null);
  }
}
