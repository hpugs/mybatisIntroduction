package com.hpugs.mybatis.mapper;

import java.util.List;

import com.hpugs.mybatis.pojo.User;

/**
 * @Description 用户映射
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午2:49:58
 */
public interface IUserMapper {
	
	/**
	 * @Description 添加
	 * @param user
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月21日 上午11:47:30
	 */
	int add(User user);
	
	/**
	 * @Description 修改
	 * @param user
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月21日 上午11:50:55
	 */
	int update(User user);
	
	/**
	 * @Description 删除
	 * @param id
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月21日 上午11:51:09
	 */
	int del(Integer id);
	
	/**
	 * @Description 查询用户
	 * @param id 用户id
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月18日 下午3:00:19
	 */
	User select(int id);
	
	/**
	 * @Description 列表查询
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月21日 上午11:51:29
	 */
	List<User> findList();

}
