package com.scs.soft.zhifu.api.mapper;

import com.scs.soft.zhifu.api.ZhifuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes=ZhifuApiApplication.class)
class FavoriteMapperTest {
    @Resource
    private FavoriteMapper  favoriteMapper;

    @Test
    void selectAll() {
        List<Map> favorites = favoriteMapper.selectAll();
        favorites.forEach(System.out::println);
    }
}