package top.yun.mapping;

import org.mapstruct.Mapper;
import top.yun.pojo.dto.OrderDTO;
import top.yun.constants.DateConsts;
import top.yun.handler.BaseMapping;
import top.yun.entity.OrderDO;

import java.time.format.DateTimeFormatter;

/**
 * @author yun
 * @date 2024/9/20
 * @description OrderMapping
 **/
@Mapper(componentModel = "spring")
public interface OrderMapping extends BaseMapping<OrderDO, OrderDTO> {

    @Override
    default void afterConvertTo(OrderDO src, OrderDTO dest) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DateConsts.YYYY_MM_DD_HH_MM_SS);
        dest.setCreateTime(src.getCreateTime().format(dateTimeFormatter));
        dest.setUpdateTime(src.getUpdateTime().format(dateTimeFormatter));
    }

}