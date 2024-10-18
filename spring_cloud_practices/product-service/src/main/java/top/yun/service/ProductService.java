package top.yun.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.yun.pojo.query.ProductStockDeductQuery;
import top.yun.entity.ProductDO;

/**
 * @author yun
 * @date 2024/9/20
 * @description ProductService
 **/
public interface ProductService extends IService<ProductDO> {

    /**
     * 减库存
     *
     * @param productStockDeductQuery 查询参数
     * @return int
     */
    int deduct(ProductStockDeductQuery productStockDeductQuery);

}
