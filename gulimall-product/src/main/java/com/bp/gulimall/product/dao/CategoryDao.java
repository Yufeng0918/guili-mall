package com.bp.gulimall.product.dao;

import com.bp.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author daiyu
 * @email jiangyufeng@gmail.com
 * @date 2020-04-22 08:36:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
