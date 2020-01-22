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
public interface ColumnsMapper {
    /**
     * 从数据库里随机抽取十个数据
     * @return
     */
    @Select("SELECT * FROM t_columns ORDER BY RAND() LIMIT 8")
    @Results({
            @Result(id = true,property = "id",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imagesUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class)
    })
    List<Map> selectTen();
}
