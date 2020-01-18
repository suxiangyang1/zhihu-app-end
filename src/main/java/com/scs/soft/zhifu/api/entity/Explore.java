package com.scs.soft.zhifu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ysx
 * @date
 */
@Data
@Builder
public class Explore {
    private Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
