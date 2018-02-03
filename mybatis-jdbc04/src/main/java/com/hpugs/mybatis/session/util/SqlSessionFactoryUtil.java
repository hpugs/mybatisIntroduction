package com.hpugs.mybatis.session.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Description SqlSession工厂
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午3:04:07
 */
public class SqlSessionFactoryUtil {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	private static SqlSessionFactory getSqlSessionFactory() throws IOException{
		if(null == sqlSessionFactory){
			InputStream inputStream = null;
			try{
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}catch (IOException e) {
				// TODO: handle exception
				System.err.println(e.toString());
			}finally {
				if(null != inputStream){
					inputStream.close();
				}
			}
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession openSqlSession(){
		SqlSession sqlSession = null;
		try {
			sqlSession = getSqlSessionFactory().openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSession;
	}

}
