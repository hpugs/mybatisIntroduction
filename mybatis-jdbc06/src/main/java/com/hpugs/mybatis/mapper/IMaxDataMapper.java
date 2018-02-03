package com.hpugs.mybatis.mapper;

import com.hpugs.mybatis.pojo.MaxData;

/**
 * @Description 大文本对象
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年12月18日 下午2:49:58
 */
public interface IMaxDataMapper {
	
	/**
	 * @Description 插入大文本
	 * @param maxData
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午10:00:35
	 */
	Integer insertMaxData(MaxData maxData);
	
	/**
	 * @Description 查询大文本
	 * @param id
	 * @return
	 *
	 * @author 高尚
	 * @version 1.0
	 * @date 创建时间：2018年1月16日 上午10:00:59
	 */
	MaxData getMaxDataById(Integer id);

}
