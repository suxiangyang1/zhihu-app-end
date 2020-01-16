package com.scs.soft.zhifu.api.service;

import com.scs.soft.zhifu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */
public interface SpecialService {
    /**
     *查询所有专题
     * @return
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     * @return
     */
    List<Special> selectRecent();
}
