package com.wenjie.ssyx.common.result;

import lombok.Getter;

/**
 * @className: ResultCodeEnum
 * @description: TODO
 * @author: Wenjie FU
 * @date: 13/01/2024
 **/


@Getter
public enum ResultCodeEnum {

  SUCCESS(200, "Success"),
  FAIL(201, "Failure"),
  SERVICE_ERROR(2012, "Service Error"),
  DATA_ERROR(204, "Data Error"),
  ILLEGAL_REQUEST(205, "Illegal Request"),
  REPEAT_SUBMIT(206, "Repeat Submit"),

  LOGIN_AUTH(208, "Not Login"),
  PERMISSION(209, "No Permission"),

  ORDER_PRICE_ERROR(210, "订单商品价格变化"),
  ORDER_STOCK_FALL(204, "订单库存锁定失败"),
  CREATE_ORDER_FAIL(210, "创建订单失败"),

  COUPON_GET(220, "优惠券已经领取"),
  COUPON_LIMIT_GET(221, "优惠券已发放完毕"),

  URL_ENCODE_ERROR(216, "URL编码失败"),
  ILLEGAL_CALLBACK_REQUEST_ERROR(217, "非法回调请求"),
  FETCH_ACCESSTOKEN_FAILD(218, "获取accessToken失败"),
  FETCH_USERINFO_ERROR(219, "获取用户信息失败"),


  SKU_LIMIT_ERROR(230, "购买个数不能大于限购个数"),
  REGION_OPEN(240, "该区域已开通"),
  REGION_NO_OPEN(240, "该区域未开通"),
  ;

  private final Integer code;

  private final String message;

  private ResultCodeEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }
}
