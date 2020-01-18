package com.scs.soft.zhifu.api.mapper;

import com.scs.soft.zhifu.api.ZhifuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@SpringBootTest(classes = ZhifuApiApplication.class)
class ExploreMapperTest {
    @Resource
    private ExploreMapper exploreMapper;
    @Test
    void selectAll() {
        List<Map> explores = exploreMapper.selectAll();
        explores.forEach(System.out::println);
    }
}