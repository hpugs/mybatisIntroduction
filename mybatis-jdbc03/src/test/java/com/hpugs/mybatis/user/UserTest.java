package com.hpugs.mybatis.user;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
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
	private static SqlSession sqlSession = null;
	private static IUserMapper userMapper = null;
	
	@Before
	public void setUp(){
		sqlSession = SqlSessionFactoryUtil.openSqlSession();
		userMapper = sqlSession.getMapper(IUserMapper.class);
	}
	
	@Test
	public void addUser(){
		User user = new User();
		user.setName("赵二");
		user.setMobile("18325862558");
		user.setPwd("123456");
		user.setBirthday(new Date());
		user.setState(1);
		Integer status = userMapper.add(user);
		if(0 < status){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	
	@Test
	public void updateUser(){
		User user = new User();
		user.setId(23);
		user.setName("赵二2");
		user.setMobile("18325862558");
		user.setPwd("1234562323");
		user.setBirthday(new Date());
		user.setState(1);
		Integer status = userMapper.update(user);
		if(0 < status){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	
	@Test
	public void delUser(){
		Integer status = userMapper.del(23);
		if(0 < status){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}
	
	@Test
	public void getUser(){
		User user = userMapper.select(1);
		System.out.println(JSONObject.toJSON(user));
	}
	
	@Test
	public void findListUser(){
		List<User> users = userMapper.findList();
		System.out.println(JSONObject.toJSON(users));
	}
	
	@After
	public void setDown(){
		sqlSession.commit();
		sqlSession.close();
	}

}
