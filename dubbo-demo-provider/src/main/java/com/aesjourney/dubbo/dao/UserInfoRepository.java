package com.aesjourney.dubbo.dao;

import com.aesjourney.dubbo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserRepository
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/30 21:30
 **/
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
    UserInfo findByUsername(String username);
}
