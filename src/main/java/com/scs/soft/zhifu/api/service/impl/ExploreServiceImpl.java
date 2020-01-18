package com.scs.soft.zhifu.api.service.impl;

import com.scs.soft.zhifu.api.mapper.ExploreMapper;
import com.scs.soft.zhifu.api.service.ExploreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */
@Service
public class ExploreServiceImpl implements ExploreService {
    @Resource
    private ExploreMapper exploreMapper;

    @Override
    public List<Map> selectAll() {
        return exploreMapper.selectAll();
    }
}
