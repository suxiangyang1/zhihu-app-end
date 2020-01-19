package com.scs.soft.zhifu.api.controller;

import com.scs.soft.zhifu.api.common.Result;
import com.scs.soft.zhifu.api.mapper.FavoriteMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ysx
 * @date
 */
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteMapper favoriteMapper;
    @GetMapping
    public Result getAllFavorite(){
        return Result.success(favoriteMapper.selectAll());
    }
}
