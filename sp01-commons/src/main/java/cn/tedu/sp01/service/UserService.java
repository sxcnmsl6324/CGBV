package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;

// 用户的业务接口
public interface UserService {
    // 获取用户
    User getUser(Integer userId);

    // 增加用户积分
    void addScore(Integer userId, Integer score);
}
