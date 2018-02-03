package com.hpugs.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.hpugs.mybatis.pojo.User;

/**
 * @Description 用户映射
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午2:49:58
 */
public interface IUserMapper {
	
	/**
	 * @Description 传入多个输入参数
	 * @param name
	 * @param state
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午11:53:38
	 */
	List<User> findUsers(String name, Integer state);
	
	/**
	 * @Description 逻辑分页
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午11:54:00
	 */
	List<User> findUsersRowBounds(RowBounds rowBounds);
	
	/**
	 * @Description 物理分页
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午11:54:16
	 */
	List<User> findUsersByParams(Map<String, Object> row);

}
