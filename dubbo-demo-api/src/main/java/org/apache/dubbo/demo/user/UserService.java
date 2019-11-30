package org.apache.dubbo.demo.user;

import com.aesjourney.dubbo.model.UserInfo;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/30 21:12
 **/
public interface UserService {
    UserInfo getUserById(Integer id);
    UserInfo getUserByName(String username);
    void registerUser(UserInfo userInfo);
}
