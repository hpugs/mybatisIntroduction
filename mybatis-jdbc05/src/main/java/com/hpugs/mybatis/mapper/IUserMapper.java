package com.hpugs.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.hpugs.mybatis.pojo.User;

/**
 * @Description 动态sql练习
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午2:49:58
 */
public interface IUserMapper {
	
	/**
	 * @Description if的使用
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2017年12月18日 下午3:00:19
	 */
	List<User> searchUserByParams01(Map<String, Object> params);
	
	/**
	 * @Description choose的使用
	 * 有时候我们并不想应用所有的条件，而只是想从多个选项中选择一个。MyBatis提供了choose 元素，按顺序判断when中的条件出否成立，如果有一个成立，则choose结束。当choose中所有when的条件都不满则时，则执行 otherwise中的sql。
	 * @param params
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月15日 下午4:08:47
	 */
	List<User> searchUserByParams02(Map<String, Object> params);
	
	/**
	 * @Description where的使用
	 * @param params
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月15日 下午4:09:14
	 */
	List<User> searchUserByParams03(Map<String, Object> params);
	
	/**
	 * @Description trim的使用
	 * prefix：前缀覆盖并增加其内容
       suffix：后缀覆盖并增加其内容
       prefixOverrides：前缀判断的条件
       suffixOverrides：后缀判断的条件
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月15日 下午4:09:14
	 */
	List<User> searchUserByParams04(Map<String, Object> params);
	
	/**
	 * @Description foreach的使用
	 * @param params
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月15日 下午4:22:01
	 */
	List<User> searchUserByParams05(Map<String, Object> params);
	
	/**
	 * @Description 修改用户
	 * @param user
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月15日 下午4:53:10
	 */
	int updateUser(User user);

}
