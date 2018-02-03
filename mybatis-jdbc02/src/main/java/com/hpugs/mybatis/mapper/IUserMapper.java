package com.hpugs.mybatis.mapper;

import com.hpugs.mybatis.pojo.User;

/**
 * @Description 用户映射
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午2:49:58
 */
public interface IUserMapper {
	
	/**
	 * @Description 查询用户
	 * @param id 用户id
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月18日 下午3:00:19
	 */
	User selectUser(int id);

}
