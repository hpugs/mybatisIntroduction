package com.hpugs.mybatis.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hpugs.mybatis.mapper.IMaxDataMapper;
import com.hpugs.mybatis.pojo.MaxData;
import com.hpugs.mybatis.session.util.SqlSessionFactoryUtil;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午3:30:00
 */
public class MaxDataTest {
	
	private SqlSession sqlSession;
	private IMaxDataMapper maxDataMapper;
	
	@Before
	public void beforeTest(){
		sqlSession = SqlSessionFactoryUtil.openSqlSession();
		maxDataMapper = sqlSession.getMapper(IMaxDataMapper.class);
	}
	
	/**
	 * @Description 插入大文本数据
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午11:48:28
	 */
	@Test
	public void insertMaxData(){
		MaxData maxData = new MaxData();
		try{
			File file = new File("D:/image/28.jpg");
			FileInputStream inputStream = new FileInputStream(file);
			byte [] pic = new byte[inputStream.available()];
			inputStream.read(pic);
			inputStream.close();
			maxData.setPic(pic);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		maxData.setRemark("这是一个文本");
		int n = maxDataMapper.insertMaxData(maxData);
		if(0 < n){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	
	/**
	 * @Description 查询大文本数据
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午11:48:51
	 */
	@Test
	public void getMaxData() throws IOException{
		MaxData maxData = maxDataMapper.getMaxDataById(4);
		System.out.println(maxData.toString());
		try{
			File file = new File("D:/image/image1.png");
			file.createNewFile();
			FileOutputStream outputStream = new FileOutputStream(file);
			outputStream.write(maxData.getPic());
			outputStream.flush();
			outputStream.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@After
	public void afterTest(){
		sqlSession.commit();
		sqlSession.close();
	}

}
