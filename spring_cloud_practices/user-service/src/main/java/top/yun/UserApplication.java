package top.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import top.yun.handler.FeignConfig;
import top.yun.handler.SentinelConfig;
import top.yun.mybatis.MyBatisConfig;
import top.yun.properties.JwtProperties;
import top.yun.properties.SsyProperties;


/**
 * @author yun
 * @date 2024/9/11
 * @description UserApplication
 **/
@SpringBootApplication
@EnableFeignClients
@Import({MyBatisConfig.class, FeignConfig.class, SentinelConfig.class})
@EnableConfigurationProperties({SsyProperties.class, JwtProperties.class})
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}