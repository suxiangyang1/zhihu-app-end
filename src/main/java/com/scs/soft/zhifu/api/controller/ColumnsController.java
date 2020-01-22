package com.scs.soft.zhifu.api.controller;

import com.scs.soft.zhifu.api.common.Result;
import com.scs.soft.zhifu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ysx
 * @date
 */
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;
    @GetMapping
    public Result getTen(){
        return Result.success(columnsService.selectTen());
    }
}
