package top.yun.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.yun.pojo.dto.OrderDTO;
import top.yun.pojo.query.OrderCreateQuery;
import top.yun.entity.OrderDO;

/**
 * @author yun
 * @date 2024/9/20
 * @description OrderService
 **/
public interface OrderService extends IService<OrderDO> {
    /**
     * 下单
     * @param orderCreateQuery
     * @return
     */
    OrderDTO createOrder(OrderCreateQuery orderCreateQuery);
}