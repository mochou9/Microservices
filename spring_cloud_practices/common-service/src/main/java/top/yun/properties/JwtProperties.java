package top.yun.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yun
 * @date 2024/9/20
 * @description JwtProperties
 **/
@Data
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private String secretKey;

}