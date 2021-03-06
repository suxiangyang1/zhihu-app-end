package com.scs.soft.zhifu.api.mapper;

import com.scs.soft.zhifu.api.ZhifuApiApplication;
import com.scs.soft.zhifu.api.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhifuApiApplication.class)
class SpecialMapperTest {
    @Resource SpecialMapper specialMapper;
    @Resource SectionMapper sectionMapper;

    @Test
    void selectRecent() {
        List<Special> specials = specialMapper.selectRecent();
        specials.forEach(System.out::println);

    }

    @Test
    void selectAll() {
        List<Map> special = specialMapper.selectAll();
        special.forEach(System.out::println);
    }
}