package com.scs.soft.zhifu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author ysx
 * @date
 */
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
