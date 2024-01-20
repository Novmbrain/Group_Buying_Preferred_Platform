package com.wenjie.ssyx.common.exception;

import com.wenjie.ssyx.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @className: CustomizedExcpetion
 * @description: TODO
 * @author: Wenjie FU
 * @date: 14/01/2024
 **/

@Data
public class CustomizedException extends RuntimeException {
  // Error code
  private Integer code;

  public CustomizedException(Integer code, String message) {
    super(message);
    this.code = code;
  }

  public CustomizedException(ResultCodeEnum resultCodeEnum) {
    super(resultCodeEnum.getMessage());
    this.code = resultCodeEnum.getCode();
  }


}
