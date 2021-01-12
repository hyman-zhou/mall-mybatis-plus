package com.csasc.store.modules.pms.service;

import com.csasc.store.modules.pms.model.PmsProduct;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-12
 */
public interface PmsProductService extends IService<PmsProduct> {
    List<PmsProduct> listAllProduct();
}
