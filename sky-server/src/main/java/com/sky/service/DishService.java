package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface DishService {
    public void saveWithFlavor(DishDTO dish);

    PageResult pageQuery(DishPageQueryDTO dishQueryDTO);

    void deleteBatch(List<Long> ids);
}
