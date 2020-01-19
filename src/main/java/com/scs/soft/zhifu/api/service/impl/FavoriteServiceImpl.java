package com.scs.soft.zhifu.api.service.impl;

import com.scs.soft.zhifu.api.mapper.FavoriteMapper;
import com.scs.soft.zhifu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Map> selectAll() {
        return favoriteMapper.selectAll();
    }
}
