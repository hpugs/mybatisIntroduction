package com.hpugs.mybatis.pojo;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2018年1月8日 下午7:05:54
 */
public class Account {
	
	private Integer id;
	private String account;
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", account=" + account + ", user=" + user + "]";
	}
	
}
