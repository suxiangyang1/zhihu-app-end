package com.scs.soft.zhifu.api.mapper;

import com.scs.soft.zhifu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ysx
 * @date
 */
public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     * @param specialId
     * @return
     */
    @Select("SELECT * FROM t_section WHERE special_id =#{specialId}")
    List<Section> getSectionsBySpecialId(String specialId);
}
