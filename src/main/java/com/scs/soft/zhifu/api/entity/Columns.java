package com.scs.soft.zhifu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ysx
 * @date
 */
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
