package com.scs.soft.zhifu.api.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ysx
 * @date
 */
public interface ExploreMapper {
    /**
     * 查询所有圆桌
     * @return
     */
    @Select("SELECT * FROM t_round_table")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Integer.class),
            @Result(property = "name",column = "name",javaType = String.class),
            @Result(property = "banner",column = "banner",javaType = String.class),
            @Result(property = "urlToken",column = "url_token",javaType = String.class),
            @Result(property = "visitsCount",column = "visits_count",javaType = Integer.class),
            @Result(property = "includeCount", column = "include_count",javaType = Integer.class)
    })
    List<Map> selectAll();
}
