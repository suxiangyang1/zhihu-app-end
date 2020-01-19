package com.scs.soft.zhifu.api.service;

import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */

public interface FavoriteService {
    /**
     * 查询收藏的所有内容
     * @return
     */
    List<Map> selectAll();
}
