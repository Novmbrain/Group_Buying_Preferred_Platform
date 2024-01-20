package com.wenjie.ssyx.acl.controller;

import com.wenjie.ssyx.common.result.Result;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: IndexController
 * @description: TODO
 * @author: Wenjie FU
 * @date: 17/01/2024
 **/

@RestController
@RequestMapping("admin/acl/index")
@CrossOrigin // 解决前后端跨域访问问题
@Api(tags = "登录接口")
public class IndexController {

  @PostMapping("login")
  public Result login() {
    Map<String, Object> map = new HashMap<>();
    map.put("token", "admin");
    return Result.ok(map);
  }

  @GetMapping("info")
  public Result get() {
    Map<String, String> map = new HashMap<>();
    map.put("name", "admin");
    map.put("avatar", "https://guli-file-1" +
      "90513.oss-cn-beijing.aliyuncs.com/avatar/default.jpg");
    return Result.ok(map);
  }

  @PostMapping("logout")
  public Result logout() {
    return Result.ok(null);
  }
}
