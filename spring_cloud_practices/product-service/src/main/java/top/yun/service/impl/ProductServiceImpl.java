package top.yun.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import top.yun.entity.ProductDO;
import top.yun.pojo.query.ProductStockDeductQuery;
import top.yun.service.ProductService;

/**
 * @author yun
 * @date 2024/9/20
 * @description ProductServiceImpl
 **/
@RequiredArgsConstructor
@Service
@Slf4j
public class ProductServiceImpl extends ServiceImpl<top.yun.mapper.ProductMapper, ProductDO> implements ProductService {

    private final top.yun.mapper.ProductMapper productMapper;

    @Override
    public int deduct(@RequestBody ProductStockDeductQuery productStockDeductQuery) {
        return productMapper.deduct(productStockDeductQuery.getProductId(),
                productStockDeductQuery.getCount());
    }

}