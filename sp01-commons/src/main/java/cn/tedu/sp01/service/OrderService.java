package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;

// 订单的业务接口
public interface OrderService {
    // 获取订单
    Order getOrder(String orderId);

    // 保存订单
    void saveOrder(Order order);
}
