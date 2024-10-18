package top.yun.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import top.yun.facade.ProductFacade;
import top.yun.constants.ServiceConsts;

/**
 * @author yun
 * @date 2024/9/20
 * @description ProductService
 **/
@FeignClient(value = ServiceConsts.PRODUCT_SERVICE, fallbackFactory = top.yun.service.feign.ProductServiceFallBackFactory.class)
public interface ProductService extends ProductFacade {

}