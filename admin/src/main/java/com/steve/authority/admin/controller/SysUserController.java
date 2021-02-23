package com.steve.authority.admin.controller;

import com.steve.authority.admin.service.SysUserService;
import com.steve.authority.core.http.HttpResult;
import com.steve.authority.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = "/findAll")
    public  Object findAll() {
        return sysUserService.findAll();
    }

    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
