package com.scs.soft.zhifu.api.controller;

import com.scs.soft.zhifu.api.common.Result;
import com.scs.soft.zhifu.api.service.ExploreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ysx
 * @date
 */
@RestController
@RequestMapping(value = "/api/explore")
public class ExploreController {
    @Resource
    private ExploreService exploreService;
    @GetMapping(value = "/all")
    public Result getAllExplores(){
        return Result.success(exploreService.selectAll());
    }
}
