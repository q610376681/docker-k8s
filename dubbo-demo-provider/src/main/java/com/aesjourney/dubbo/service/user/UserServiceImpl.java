package com.aesjourney.dubbo.service.user;

import com.aesjourney.dubbo.dao.UserInfoRepository;
import com.aesjourney.dubbo.model.UserInfo;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/30 21:29
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userRepository;
    @Override
    public UserInfo getUserById(Integer id) {
        return null;
    }

    @Override
    public UserInfo getUserByName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void registerUser(UserInfo userInfo) {

    }
}
