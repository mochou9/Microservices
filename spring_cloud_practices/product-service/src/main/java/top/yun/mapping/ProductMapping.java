package top.yun.mapping;

import org.mapstruct.Mapper;
import top.yun.pojo.dto.ProductDTO;
import top.yun.handler.BaseMapping;
import top.yun.entity.ProductDO;

/**
 * @author yun
 * @date 2024/9/20
 * @description ProductMapping
 **/
@Mapper(componentModel = "spring")
public interface ProductMapping extends BaseMapping<ProductDO, ProductDTO> {

}