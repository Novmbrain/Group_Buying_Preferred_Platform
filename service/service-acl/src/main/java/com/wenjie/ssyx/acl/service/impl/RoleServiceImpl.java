package com.wenjie.ssyx.acl.service.impl;

import com.atguigu.ssyx.model.acl.Role;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wenjie.ssyx.acl.mapper.RoleMapper;
import com.wenjie.ssyx.acl.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @className: RoleServiceImpl
 * @description: TODO
 * @author: Wenjie FU
 * @date: 20/01/2024
 **/

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
