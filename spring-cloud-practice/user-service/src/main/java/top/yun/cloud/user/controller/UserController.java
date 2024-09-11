package top.yun.cloud.user.controller;

import top.yun.cloud.user.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yun
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{userId}/orders")
    public List<String> getUserOrders(@PathVariable String userId) {
        return userService.getUserOrders(userId);
    }
}
