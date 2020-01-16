package com.scs.soft.zhifu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ysx
 * @date
 *
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
