package com.hpugs.mybatis.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	private static SqlSession sqlSession;
	private static IUserMapper userMapper;
	
	@Before
	public void beforeTest(){
		sqlSession = SqlSessionFactoryUtil.openSqlSession();
		userMapper = sqlSession.getMapper(IUserMapper.class);
	}
	
	@Test
	public void getUser01(){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("gradeId", 2);
		params.put("name", "%abc%");
//		params.put("state", 1);
		List<User> users = userMapper.searchUserByParams01(params);
		for (User user : users) {
			System.out.println(JSONObject.toJSON(user));
		}
	}
	
	@Test
	public void getUser02(){
		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("gradeId", 2);
		params.put("name", "%abc%");
//		params.put("state", 1);
		List<User> users = userMapper.searchUserByParams02(params);
		for (User user : users) {
			System.out.println(JSONObject.toJSON(user));
		}
	}
	
	@Test
	public void getUser03(){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("gradeId", 2);
		params.put("name", "%abc%");
		params.put("state", 1);
		List<User> users = userMapper.searchUserByParams03(params);
		for (User user : users) {
			System.out.println(JSONObject.toJSON(user));
		}
	}
	
	@Test
	public void getUser04(){
		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("gradeId", 2);
//		params.put("name", "%abc%");
//		params.put("state", 1);
		List<User> users = userMapper.searchUserByParams04(params);
		for (User user : users) {
			System.out.println(JSONObject.toJSON(user));
		}
	}
	
	@Test
	public void getUser05(){
		List<Integer> gradeIds = new ArrayList<Integer>();
		gradeIds.add(2);
//		gradeIds.add(3);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("gradeIds", gradeIds);
		List<User> users = userMapper.searchUserByParams05(params);
		for (User user : users) {
			System.out.println(JSONObject.toJSON(user));
		}
	}
	
	@Test
	public void updateUser06(){
		User user = new User();
		user.setId(3);
		user.setName("abc");
		user.setMobile("18300061234");
		user.setState(2);
		int n = userMapper.updateUser(user);
		if(0 < n){
			System.out.println("更新操作成功");
		}else{
			System.out.println("更新操作失败");
		}
	}
	
	@After
	public void afterTest(){
		sqlSession.commit();
		sqlSession.close();
	}

}
