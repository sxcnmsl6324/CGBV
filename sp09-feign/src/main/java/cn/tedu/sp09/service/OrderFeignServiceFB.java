package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.web.util.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignServiceFB implements OrderFeignService{
    @Override
    public JsonResult<Order> getOrder(String orderId) {
        return JsonResult.err("无法获取用户信息");
    }

    @Override
    public JsonResult addOrder() {
        return JsonResult.err("无法增加用户积分");
    }
}
