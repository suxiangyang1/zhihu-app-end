package com.scs.soft.zhifu.api.service;

import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */
public interface ColumnsService {
    /**
     * 获取数据中的任意十个
     * @return
     */
    List<Map> selectTen();
}
