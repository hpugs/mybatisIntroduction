package com.hpugs.mybatis.pojo;

import java.util.List;

/**
 * @Description 年级
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2018年1月15日 下午2:23:04
 */
public class Grade {

	private Integer id;
	private String name;
	private List<User> users;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
	
}
