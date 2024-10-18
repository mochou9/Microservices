package top.yun.handler;

import org.springframework.context.annotation.Import;

/**
 * @author yun
 * @date 2024/9/20
 * @description FeignConfig
 **/
@Import({FeignRequestInterceptor.class})
public class FeignConfig {

}