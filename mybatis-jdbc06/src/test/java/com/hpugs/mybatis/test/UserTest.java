package com.hpugs.mybatis.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	
	private SqlSession sqlSession;
	private IUserMapper userMapper;
	
	@Before
	public void beforeTest(){
		sqlSession = SqlSessionFactoryUtil.openSqlSession();
		userMapper = sqlSession.getMapper(IUserMapper.class);
	}
	
	@Test
	public void getUsers() throws IOException{
		List<User> users = userMapper.findUsers("%abc%", 2);
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void getUsersRowBounds() throws IOException{
		RowBounds row = new RowBounds(5, 5);
		List<User> users = userMapper.findUsersRowBounds(row);
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void getUsersByParams(){
		Map<String, Object> row = new HashMap<String, Object>();
		row.put("offset", 0);
		row.put("offsize", 5);
		List<User> users = userMapper.findUsersByParams(row);
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
	
	@After
	public void afterTest(){
		sqlSession.commit();
		sqlSession.close();
	}

}
