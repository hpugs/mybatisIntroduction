package com.hpugs.mybatis.user;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.hpugs.mybatis.mapper.IUserMapper;
import com.hpugs.mybatis.pojo.User;
import com.hpugs.mybatis.session.util.SqlSessionFactoryUtil;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午3:30:00
 */
public class UserTest {
	
	@Test
	public void getUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
		IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
		User user = userMapper.selectUser(2);
		System.out.println(JSONObject.toJSON(user));
		sqlSession.close();
	}

}
