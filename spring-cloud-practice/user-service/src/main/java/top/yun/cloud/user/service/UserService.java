package top.yun.cloud.user.service;

import top.yun.cloud.user.feign.OrderClient;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yun
 */
@Service
public class UserService {
    @Resource
    private OrderClient orderClient;

    public List<String> getUserOrders(String userId) {
        return orderClient.getUserOrders(userId);
    }
}
