package cn.tedu.sp04.order.feignClient;

import cn.tedu.sp04.order.feignClient.UserFeignServiceFB;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tedu.sp01.pojo.User;
import cn.tedu.web.util.JsonResult;

@FeignClient(name="user-service", fallback = UserFeignServiceFB.class)
public interface UserFeignService {
    @GetMapping("/{userId}")
    JsonResult<User> getUser(@PathVariable("userId") Integer userId);

    @GetMapping("/{userId}/score")
    JsonResult addScore(@PathVariable("userId") Integer userId, @RequestParam("score") Integer score);
}
