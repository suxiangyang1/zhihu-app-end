package com.scs.soft.zhifu.api.service.impl;

import com.scs.soft.zhifu.api.entity.Columns;
import com.scs.soft.zhifu.api.mapper.ColumnsMapper;
import com.scs.soft.zhifu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */
@Service
public class CoulmnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;
    @Override
    public List<Map> selectTen() {
        return columnsMapper.selectTen();
    }
}
