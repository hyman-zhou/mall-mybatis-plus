package com.csasc.store.modules.pms.mapper;

import com.csasc.store.modules.pms.model.PmsProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-12
 */
public interface PmsProductMapper extends BaseMapper<PmsProduct> {

    List<PmsProduct> listAllProduct();
}
