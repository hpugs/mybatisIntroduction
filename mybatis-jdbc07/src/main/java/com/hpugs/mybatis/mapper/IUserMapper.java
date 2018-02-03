package com.hpugs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hpugs.mybatis.pojo.User;

/**
 * @Description 用户映射
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午2:49:58
 */
public interface IUserMapper {
	
	@Insert("insert into user (name, mobile, pwd, state) values (#{name}, #{mobile}, #{pwd}, #{state})")
	int insertUser(User user);
	
	@Update("update user set name=#{name}, mobile=#{mobile}, pwd=#{pwd}, state=#{state} where id=#{id}")
	Integer updateUser(User user);
	
	@Delete("delete from user where id=#{id}")
	Integer delUser(Integer id);
	
	@Select("select * from user where id=#{id}")
	User getUserById(Integer id);
	
	@Select("select * from user")
	List<User> findUsers();
	
	@Select("select * from user")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="name",property="name"),
		@Result(column="mobile",property="mobile"),
		@Result(column="pwd",property="pwd"),
		@Result(column="state",property="state")
	})
	List<User> findUserWithResult();

}
