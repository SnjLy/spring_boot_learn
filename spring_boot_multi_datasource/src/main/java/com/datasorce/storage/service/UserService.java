package com.datasorce.storage.service;

import com.datasorce.storage.dao.hlj.mapper.UserCollectMapper;
import com.datasorce.storage.dao.hlj.entity.UserCollect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.datasource.storage.service
 * @Description:
 * @function:
 * @Author : LiuYong
 * Created by yehao on 2018/8/28.
 */
@Service
public class UserService {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserCollectMapper userCollectMapper;

    public List<UserCollect> queryUserCollect(String userId, Date nearDate){
        LOGGER.info("userId:" + userId + " | nearDate:" + nearDate);
        return userCollectMapper.queryUserCollect(userId,nearDate);
    }
}
