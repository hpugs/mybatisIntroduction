package com.hpugs.mybatis;

import java.util.List;

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
	public void insertUser(){
		User user = new User();
		user.setName("hpugs");
		user.setMobile("1234567890X");
		user.setPwd("123456");
		user.setState(1);
		Integer n = userMapper.insertUser(user);
		if(0 < n){
			System.out.println("操作成功");
		}else{
			System.out.println("操作失败");
		}
	}
	
	@Test
	public void updateUser(){
		User user = new User();
		user.setId(25);
		user.setName("hpugs25");
		user.setMobile("1234567890X");
		user.setPwd("123456");
		user.setState(1);
		Integer n = userMapper.updateUser(user);
		if(0 < n){
			System.out.println("操作成功");
		}else{
			System.out.println("操作失败");
		}
	}
	
	@Test
	public void delUser(){
		Integer n = userMapper.delUser(25);
		if(0 < n){
			System.out.println("操作成功");
		}else{
			System.out.println("操作失败");
		}
	}
	
	@Test
	public void getUserById(){
		User user = userMapper.getUserById(24);
		if(null != user){
			System.out.println(user.toString());
		}else{
			System.out.println("用户不存在");
		}
	}
	
	@Test
	public void getUsers(){
		List<User> users = userMapper.findUsers();
		if(null != users){
			for (User user : users) {
				System.out.println(user.toString());
			}
		}else{
			System.out.println("用户不存在");
		}
	}
	
	@Test
	public void getUserWidthResult(){
		List<User> users = userMapper.findUserWithResult();
		if(null != users){
			for (User user : users) {
				System.out.println(user.toString());
			}
		}else{
			System.out.println("用户不存在");
		}
	}
	
	@After
	public void afterTest(){
		sqlSession.commit();
		sqlSession.close();
	}

}
