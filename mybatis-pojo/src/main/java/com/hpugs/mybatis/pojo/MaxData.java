package com.hpugs.mybatis.pojo;

/**
 * @Description 大文本操作
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2018年1月16日 上午9:56:22
 */
public class MaxData {
	
	private Integer id;
	private byte[] pic;
	private String	remark;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "MaxData [id=" + id + ", remark=" + remark + "]";
	}

}
