package com.hpugs.mybatis.user;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.hpugs.mybatis.mapper.IAccountMapper;
import com.hpugs.mybatis.mapper.IGradeMapper;
import com.hpugs.mybatis.pojo.Account;
import com.hpugs.mybatis.pojo.Grade;
import com.hpugs.mybatis.session.util.SqlSessionFactoryUtil;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午3:30:00
 */
public class UserTest {
	
	/*
	 * 账号和用户---1vs1
	 */
	@Test
	public void getAccount(){
		SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
		IAccountMapper accountMapper = sqlSession.getMapper(IAccountMapper.class);
		Account account = accountMapper.selectAccount(2);
		System.out.println(JSONObject.toJSON(account));
		sqlSession.close();
	}
	
	/*
	 * 年级和用户---1vsM
	 */
	@Test
	public void getGeade(){
		SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
		IGradeMapper gradeMapper = sqlSession.getMapper(IGradeMapper.class);
		Grade grade = gradeMapper.getGradeById(2);
		System.out.println(JSONObject.toJSON(grade));
		sqlSession.close();
	}

}
