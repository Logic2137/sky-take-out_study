package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.context.annotation.Bean;

public interface DishService {
    public void saveWithFlavor(DishDTO dish);
}
