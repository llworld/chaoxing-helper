package com.malik.chaoxinghelper;

import com.malik.chaoxinghelper.dao.entity.User;
import com.malik.chaoxinghelper.dao.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class ChaoxingHelperApplicationTests {

    @Autowired
    SqlSession sqlSession;

    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        log.info(sqlSession+"");
        log.info(sqlSession.getConnection()+"");
        User user = userMapper.selectById(1);
        log.info(user+"");
    }

}
