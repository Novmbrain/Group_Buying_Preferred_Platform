package com.wenjie.ssyx.acl.controller;

import com.atguigu.ssyx.model.acl.Role;
import com.atguigu.ssyx.vo.acl.RoleQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wenjie.ssyx.acl.service.RoleService;
import com.wenjie.ssyx.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: RoleController
 * @description: TODO
 * @author: Wenjie FU
 * @date: 20/01/2024
 **/
@Api(tags = "角色接口")
@RestController
@CrossOrigin
@RequestMapping("/admin/acl/role")
public class RoleController {

  @Autowired
  private RoleService roleService;
  @ApiOperation("获取角色分页列表")
  @GetMapping("{page}/{limit}")
  public Result getPageList(@PathVariable long current,
                            @PathVariable int limit,
                            RoleQueryVo roleQueryVo) {

    // 创建 Page 对象，传递当前页和每页的记录数
    IPage<Role> page = new Page<>(current, limit);

    // 调用 service 方法实现条件分页查询，返回分页对象


    return Result.ok(null);
  }
}
