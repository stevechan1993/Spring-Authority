package com.steve.authority.admin.controller;

import com.steve.authority.admin.model.SysDict;
import com.steve.authority.admin.service.SysDictService;
import com.steve.authority.core.http.HttpResult;
import com.steve.authority.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dict")
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    @PostMapping(value="/save")
    public HttpResult save(@RequestBody SysDict record) {
        return  HttpResult.ok(sysDictService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysDict> records) {
        return HttpResult.ok(sysDictService.delete(records));
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }

    @GetMapping(value = "/findByLabel")
    public HttpResult findByLabel(@RequestBody String label) {
        return HttpResult.ok(sysDictService.findByLabel(label));
    }
}
